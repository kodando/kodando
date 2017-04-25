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
