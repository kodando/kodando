# Kodando

Collection of kotlin binding libraries for existing javascript libraries.

# How to use it

Select the project and its version and replace the `{PROJECT-NAME}` and
`{PROJECT-VERSION}` with the respective ones.

## Maven

**Adding the repository:**

```xml
<repository>
    <snapshots>
        <enabled>false</enabled>
    </snapshots>
    <id>bintray-danfma-kotlin-kodando</id>
    <name>bintray</name>
    <url>https://dl.bintray.com/danfma/kotlin-kodando</url>
</repository>
```

**Adding the library:**

```xml
<dependency>
    <group>br.danfma.kodando</group>
    <artifactId>{PROJECT-NAME}</artifactId>
    <version>{PROJECT-VERSION}</version>
</dependency>
```

## Gradle

**Adding the repository:**
```groovy
maven { url "https://dl.bintray.com/danfma/kotlin-kodando" }
```

**Adding the library:**

```groovy
compile "br.danfma.kodando:{PROJECT-NAME}:{PROJECT-VERSION}"
```

## Projects

* `kodando-runtime` - Some utilities for easily working with native javascript libraries;
* `kodando-jest` - [Jest](https://facebook.github.io/jest/) bindings for testing;
* `kodando-rxjs` - [Rxjs](https://github.com/ReactiveX/rxjs) bindings;
* `kodando-react` - [React](https://reactjs.org/) bindings;
* `kodando-react-dom` - [React DOM](https://reactjs.org/) bindings;
* `kodando-react-native` - Initial support for [React Native](https://facebook.github.io/react-native/) bindings;
* `kodando-react-router-dom` - [React Router for Web](https://reacttraining.com/react-router/web) bindings. 

## REMARK

I had to reset again (Sorry!) the version schema for better maintenance versioning, 
so I changed the current group id to minimize the problems for existing users.
