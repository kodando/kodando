# kodando libraries

Kotlin JS bindings and libraries.

## HOW TO USE

**NEED TO FINISH THIS**

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

### NPM (temporary publications)

You can reference all this libraries as a NPM library too. This will help in transition to 
better tools like the `kotlin-frontend-plugin`. You could use the jars to build your kotlin
projects into javascript, then use webpack to bundle your generated code with the already
published kodando libraries on NPM. 
 
I personally use this to help with the compilation of the project by my back-end (an asp.net mvc
project with webpack node services on it, on development time). In resume, hot reload without 
too much problems.


### CONSIDERATIONS

I may had payed attention that I have some `build.xml` files (ant files) in my project. While
ant isn't considered a sexy tool it helps with two tasks:
  
1. Don't break webpack build while recompiling the project.
    When recompiling your target folder can be deleted and if that occurs your webpack will go
    crazy and break the compilation until you restart it. But by copying the files with ant 
    to another directory, after the compilation (which is easy with IDEA), you resolve that problem
    and your HMR will work very nicely!
2. I'm lazy of publishing every package, so I created scripts for this task! :D


## REACT USAGE

### Simple functions 

* `samples/react-showroom/src/main/kotlin/showroom/examples/Hello.kt`

```kotlin
// Definition:
// 1. Create an extension function to ReactProps with some name (the component name)
// 2. In this case, the div is already an extension to ReactProps, so it will be added
//    automatically as a child of the extended props.

fun ReactProps.hello(name: String) {
    div {
        append("Hello, $name!")
    }
}


fun helloUsage() {
    // Get a container element
    val container = document.getElementById("app")!!

    // render your element (use ksx helper to use your extension)
    val view = ksx {
        hello("Daniel")
    }

    // render to the dom by:
    // option 1 (just an extension method for option 2)
    view!!.renderTo(container)

    // option 2
    ReactDOM.render(view, container)
}

```

### Components using classes:

* `samples/react-showroom/src/main/kotlin/showroom/examples/HelloByComponent.kt`

```kotlin
package showroom.stateless

import kodando.react.*
import kodando.react.dom.div

/**
 * Created by danfma on 25/04/17.
 */

// A more complex component using classes
// 1. Define a component that extends Component<Props, State>

class HelloByComponent : Component<HelloByComponent.Props, Unit>() {

    // 2. Define the component props as an interface that inherits from ReactProps
    interface Props : ReactProps {
        var name: String? // <-- nullable is important to more secure situations but you can workaround this
    }

    // 3. The render method just reacts a new ReactElement produced by the ksx helper
    override fun render(): ReactElement? {
        return ksx {
            div {
                append("Hello, ${props.name}!")
            }
        }
    }

    // 4. Define the companion as a builder of this element. In this way, you can create
    // a new ReactElement instance of this component by just calling the operator invoke method
    // of this instance. For example, in this case:
    //
    // val element = HelloByComponent {
    //   name = "Daniel"
    // }
    //
    companion object : ComponentBuilder<HelloByComponent, Props>(HelloByComponent::class)

}

// 5. An extension to add the component instance as a child of another component (by its props).
//    **Important:** don't forget the append or the component won't be added to the parent.
fun ReactProps.helloByComponent(setter: PropSetter<HelloByComponent.Props>) =
    append(HelloByComponent(setter))

```

### Stateless Renderers

* `samples/react-showroom/src/main/kotlin/showroom/examples/HelloByRenderer.kt`

This will work as the simple functions, except that the object name
will be used as the component display name, then if you check the React Dev tools,
you will see it properly defined.

```kotlin
package showroom.examples

import kodando.react.*
import kodando.react.dom.div

/**
 * Created by danfma on 25/04/17.
 */

// 1. Define an object that inherits from StatelessRenderer 
object HelloByRenderer : StatelessRenderer<HelloByRenderer.Props>() {

    // 2. Define the props as usual
    interface Props : ReactProps {
        var name: String?
    }

    // 3. The render as usual, except that it will receive the props as a parameter.
    override fun render(props: Props): ReactElement? {
        return ksx {
            div {
                append("Hello, ${props.name}!")
            }
        }
    }

}

// 4. The helper function to usage in another place.
fun ReactProps.helloByRenderer(setter: PropSetter<HelloByRenderer.Props>) =
    append(HelloByRenderer(setter))

```


## MORE SAMPLES

Give a look at the samples directory to see to how use these beasts!
