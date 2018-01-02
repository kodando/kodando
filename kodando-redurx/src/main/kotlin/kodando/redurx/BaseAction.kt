package kodando.redurx

abstract class BaseAction : Action {
    override val type: String = this::class.simpleName!!
}
