const path = require('path');
const fs = require('fs');
const shell = require('shelljs');

const workspaceDir = path.resolve(__dirname, '..');
const versionPattern = /version\s+[\'\"](\d+)\.(\d+)\.(\d+)[\'\"]/;

function getProjectVersion(projectName) {
  const name = projectName;
  const projectFileName = path.resolve(workspaceDir, projectName, 'build.gradle');
  const content = fs.readFileSync(projectFileName).toString();
  const match = versionPattern.exec(content);
  const [_, major, minor, revision] = match;

  return {
    name,
    major: Number(major),
    minor: Number(minor),
    revision: Number(revision)
  };
}

function extractProjectsVersions() {
  return shell
    .ls('-d', `${workspaceDir}/kodando-*`)
    .map(dir => path.basename(dir))
    .map(projectName => getProjectVersion(projectName));
}

module.exports = {
  extractProjectsVersions
};
