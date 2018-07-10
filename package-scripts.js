const utils = require("nps-utils");

module.exports = {
  scripts: {
    "hidden": {
      "up-major": utils.series("changelog -M", "yarn version --major --no-git-tag-version"),
      "up-minor": utils.series("changelog -m", "yarn version --minor --no-git-tag-version"),
      "up-patch": utils.series("changelog -p", "yarn version --patch --no-git-tag-version"),
      "gitadd": utils.series("git add package.json", "git add CHANGELOG.md"),
      "gitcommit": "git commit -m 'Updated version and changelog.'"
    },
    "versioning": {
      "major": utils.series("nps hidden.up-major", "nps hidden.gitadd", "nps hidden.gitcommit"),
      "minor": utils.series("nps hidden.up-minor", "nps hidden.gitadd", "nps hidden.gitcommit"),
      "patch": utils.series("nps hidden.up-patch", "nps hidden.gitadd", "nps hidden.gitcommit")
    }
  }
};
