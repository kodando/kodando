module.exports = {
  verbose: true,
  moduleDirectories: [
    'kodando-runtime/build/js',
    'kodando-jest/build/js',
    'kodando-rxjs/build/js',
    'kodando-store/build/js',
    'node_modules'
  ],
  testEnvironment: "jest-sourcemaps/lib/jsdom-env",
  testMatch: [
    '**/js-tests/*.spec.js'
  ],
  transform: {
    "^.+\\.js$": "jest-sourcemaps/lib/transformer.js"
  },
  setupTestFrameworkScriptFile: "jest-sourcemaps/lib/testEnvSetup.js"
};
