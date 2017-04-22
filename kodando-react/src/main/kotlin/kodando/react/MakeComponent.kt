package kodando.react

/**
 * Created by danfma on 07/04/17.
 */

/**
 * Creates a new named stateless component for React (a function which receives a props and returns a ReactElement).
 *
 * @param name The name of the components (shown in the React Dev Tools).
 * @param propFactory A factory for props instances.
 * @param renderer The renderer. A function that will receive a props and will return a ReactElement from it.
 * @return A function what will receive a props extension method (to configure the props of the element)
 *         and returns the element.
 */
fun <TProps : ReactProps> makeNamedComponent(
    name: String,
    propFactory: () -> TProps,
    renderer: (TProps) -> ReactElement?): (TProps.() -> Unit) -> ReactElement? {

    renderer.asDynamic()["displayName"] = name

    val propSetter = propSetterOf(propFactory)

    return { setter ->
        val props = propSetter(setter)

        createElement(renderer, props)
    }
}
