package kodando.react

/**
 * Created by danfma on 10/05/2016.
 */

fun <TComponent : Component<TProps, *>, TProps> propTypesOf(factory: JsClass<TComponent>, configure: PropTypeBuilder<TComponent, TProps>.() -> Unit) {
	val propTypeBuilder = PropTypeBuilder<TComponent, TProps>()

	propTypeBuilder.configure()
	propTypeBuilder.applyTo(factory)
}

