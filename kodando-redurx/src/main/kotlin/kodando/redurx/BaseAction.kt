package kodando.redurx

abstract class BaseAction : Action {
  override val type = this::class.simpleName!!
}
