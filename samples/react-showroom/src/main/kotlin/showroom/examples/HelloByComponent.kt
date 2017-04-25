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
