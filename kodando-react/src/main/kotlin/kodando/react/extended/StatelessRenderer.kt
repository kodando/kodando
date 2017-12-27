package kodando.react.extended

import kodando.react.ReactNode
import kodando.react.ReactProps
import kodando.react.createElement

abstract class StatelessRenderer<in TProps : ReactProps> {
    private val renderer: (TProps) -> ReactNode?

    init {
        val self = this

        renderer = { props: TProps -> self.render(props) }
        renderer.asDynamic().displayName = this::class.simpleName

        console.log("Configured the renderer", renderer)
    }

    protected abstract fun render(props: TProps): ReactNode?

    operator fun invoke(props: TProps): ReactNode? {
        return createElement(renderer, props)
    }
}
