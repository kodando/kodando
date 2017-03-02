package kodando.react

/**
 * Created by danfma on 19/01/17.
 */

abstract class ElementBuilder<out TProps : ReactProps> {
	operator abstract fun invoke(propsSetter: PropSetter<TProps>): ReactElement?
}
