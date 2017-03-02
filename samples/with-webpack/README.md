
# Rxjs Usage With Webpack (browser or Node)

This is just a sample showing how you can integrate webpack to generate a bundle that can be used
by the browser or the nodejs.

## Requirements

* NodeJS;
* Yarn (Optional);

## Building the bundle

1. Because of a problem with IDEA (at least mine) to compile the project with Kotlin, you will have
    to import the kodando project as a maven project and then compile it directly with maven;
2. In the `with-webpack` directory:
    1. Run `yarn` or `npm install`;
    2. Generate the bundle with `./node_modules/.bin/webpack` or `yarn run build` or `npm run build`;

## Executing with node

Just execute: `node ./build/rxjs-usage-bundled.js`.

## Executing with browser

Just open the `index.html`.

## Notes

* There are a lot of places to make this process better but I just tried to make it simple;
* Yes, the kotlin runtime is a monster but the guys at JetBrains are planning to make it smaller;
* Webpack plugins could be used to make the bundle smaller;
* This is a way to configure the project using the projects source. When importing from a jar package,
    you will need to configure a maven plugin to extract the generated js libraries, to then use webpack
    to generate your bundles. 
* If you are lazy, sometimes we are, you can import this project as a git submodule too. So you 
    won't need to extract the generated js libraries, however you will have to compile everything all
    the time.
