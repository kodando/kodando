## REACT USAGE

### Simple functions 

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
