const { exec, ls } = require("shelljs");

ls("-d", "kodando-*")
  .forEach(directory => {
    try {
      exec(`./publish.sh ${directory}`, { silent: true }, (code, output, err) => {
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

