package kodando.react

/**
 * This is a base class for creating simple stateless components from an object factory.
 *
 * Definition:
 *
 * ```
 * object MyComponent : StatelessRenderer<MyComponent.Props>(::Props) {
 *   class Props : ReactProps() {
 *     var message = "This is the default message"
 *   }
 *
 *   override fun render(props: Props): ReactElement? {
 *     return div("ui message") {
 *       +props.message
 *     }
 *   }
 * }
 * ```
 *
 * Usage:
 *
 * ```
 * MyComponent {
 *   message = "Hello"
 * }
 * ```
 *
 */
abstract class StatelessRenderer<TProps : ReactProps>(factory: () -> TProps = { unsafePropsOf<TProps>() }) {
    private val renderer = makeNamedComponent(this::class.simpleName!!, factory, this::render)

    /**
     * Renders a new component using the received props.
     */
    abstract fun render(props: TProps): ReactElement?

    operator fun invoke(setter: TProps.() -> Unit): ReactElement? = renderer(setter)

}
