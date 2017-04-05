# CHANGELOG

## 0.1.3

### NEW

* Added react-router@4.0.0 bindings;

### MODIFIED

* Added new overload for method createElement;


### CURRENT VERSIONS

* kodando-es6@0.2.4;
* kodando-rxjs@5.0.0-v5;
* kodando-react@15.4.3-v6;
* kodando-react-dom@15.4.3-v6;
* kodando-react-history@0.18.2-v3;
* kodando-jest@18.0.0-v3;
* kodando-history@4.5.1-v3;
* kodando-crossroads@0.12.2-v3;
* kodando-hasher@1.2.0-v3;
* kodando-mobx@3.1.7-v3;
* kodando-mobx-react@4.1.5-v3;
* kodando-mobx-location@0.2.0-v3.


## 0.1.1

### BREAKING CHANGES

* [EXPERIMENT] First try to create a standard to publish the libraries:
    * Trying to publish the libraries in Npm and into the Jar at bintray.
      This would allow to anyone who aims to consume the library by npm (using webpack for example),
      or by another workflow.
    * I'm not satisfied with the current workflow but it probably will work for
      most of the people. I think we need some better tools, some kind of
      plugins to gradle or maven.
