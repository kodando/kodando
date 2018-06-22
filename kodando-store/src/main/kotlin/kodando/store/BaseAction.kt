package kodando.store

abstract class BaseAction : Action {
  override val type = this::class.simpleName!!
}
