package kodando.react

abstract class SimpleView<TProps : ReactProps> {
  open val renderer: Renderer<TProps> = this::render.withDisplayName(this::class)
  abstract fun render(props: TProps): ReactNode?
  operator fun invoke(props: TProps): ReactNode? = React.createElement(renderer, props)
  operator fun invoke(configurer: Configurer<TProps>): ReactNode? = invoke(createProps(configurer))
}
