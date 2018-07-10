const { exec, ls } = require("shelljs");

ls("-d", "kodando-*")
  .forEach(directory => {
    try {
      exec(`./publish.sh ${directory}`, (code, output, err) => {
        if (err) {
          console.log("COULD NOT PUBLISH", directory);
        } else {
          console.log("PUBLISHED", directory);
        }
      });
    } catch (e) {
      // ignored
    }
  });

