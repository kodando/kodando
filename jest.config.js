module.exports = {
  verbose: true,
  moduleDirectories: [
    'kodando-runtime/build/js',
    'kodando-jest/build/js',
    'kodando-rxjs/build/js',
    'kodando-redurx/build/js',
    'node_modules'
  ],
  testMatch: [
    '**/js-tests/*.spec.js'
  ]
};
