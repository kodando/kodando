
# 0.1.1

## BREAKING CHANGES

* [EXPERIMENT] First try to create a standard to publish the libraries:
    * Trying to publish the libraries in Npm and into the Jar at bintray.
      This would allow to anyone who aims to consume the library by npm (using webpack for example),
      or by another workflow.
    * I'm not satisfied with the current workflow but it probably will work for
      most of the people. I think we need some better tools, some kind of
      plugins to gradle or maven.
