package kodando.react

/**
 * This is a base class for creating simple stateless components from an object factory.
 *
 * Definition:
 *
 * ```
 * object MyComponent : StatelessRenderer<MyComponent.Props>(::Props) {
 *   class Props : BaseProps() {
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
abstract class StatelessRenderer<TProps>(factory: () -> TProps) where TProps : ReactProps, TProps : Any {
    private val renderer = makeComponent(this::class.simpleName!!, factory, this::render)

    /**
     * Renders a new component using the received props.
     */
    abstract fun render(props: TProps): ReactElement?

    operator fun invoke(setter: TProps.() -> Unit): ReactElement? = renderer(setter)

}
