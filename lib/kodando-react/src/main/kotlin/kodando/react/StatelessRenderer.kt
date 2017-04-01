package kodando.react

/**
 * Created by danfma on 31/03/2017.
 */
abstract class StatelessRenderer<TProps>(private val propsFactory: () -> TProps)
where TProps : ReactProps, TProps : Any {

    internal val renderer = this::render

    init {
        renderer.asDynamic()["displayName"] = this::class.simpleName
    }

    abstract fun render(props: TProps): ReactElement?

    operator fun invoke(configure: TProps.() -> Unit): ReactElement? {
        return React.createElement(renderer, propsFactory().apply(configure))
    }
}
