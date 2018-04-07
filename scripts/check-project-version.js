const { exec } = require("shelljs");

const { stdout: diff, stderr } = exec("git diff --summary HEAD~1", {  silent: true });

if (stderr) {
  console.error(stderr);
  return;
}

const pattern = /(kodando\-\w+).*\.kt/;

const changedProjectNames = 
  Object.keys(
    diff
      .split('\n')
      .map(line => {
        const match = pattern.exec(line);
        return match && match[1];
      })
      .filter(lineMatch => !!lineMatch)
      .reduce((acc, projectName) => ({ ...acc, [projectName]: true }), {})
  );

const projectWithoutVersionChanges =
  changedProjectNames.map(projectName => {
    const { stdout: changesInGradleBuild } = exec(`git diff HEAD~1 -- ${projectName}/gradle.build`, { silent: true });

    if (!changesInGradleBuild || !isVersionUpdated(changesInGradleBuild)) {
      console.error(`- There are changes in project '${projectName}' and the project's version was not updated.`);
      return true;
    }

    return false;
  });

function isVersionUpdated(text) {
  // TODO do a better comparison...
  const pattern = /(version \'|\"\d+\.\d+\.\d+\'|\")/;

  return pattern.test(text);
}

const hasProjectWithoutVersionChange = projectWithoutVersionChanges.some(x => x);

if (hasProjectWithoutVersionChange) {
  process.exit(1);
  
} else {
  const projects =
    changedProjectNames.length 
      ? changedProjectNames.join(',')
      : 'none';

  console.log(`Changed projects: ${projects}.`);
}
