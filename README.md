# kodando libraries

Kotlin JS bindings and libraries.

### MAVEN 

1. Add the following at your pom.xml:

```xml
<repository>
    <snapshots>
        <enabled>false</enabled>
    </snapshots>
    <id>bintray-danfma-maven</id>
    <name>bintray</name>
    <url>http://dl.bintray.com/danfma/maven</url>
</repository>
```

### GRADLE

```groovy
maven { url "http://dl.bintray.com/danfma/maven" }
```
