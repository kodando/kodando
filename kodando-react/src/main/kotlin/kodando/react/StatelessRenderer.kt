package kodando.react

import kotlin.js.Promise

/**
 * Created by danfma on 03/04/17.
 */
abstract class StatelessRenderer<TProps>(private val factory: () -> TProps)
where TProps : ReactProps, TProps : Any {

    internal val renderer = this::render

    init {
        Promise
        renderer.asDynamic()["displayName"] = this::class.simpleName
    }

    abstract fun render(props: TProps): ReactElement?

    operator fun invoke(configure: TProps.() -> Unit): ReactElement? {
        return React.createElement(renderer, factory().apply(configure))
    }
}
