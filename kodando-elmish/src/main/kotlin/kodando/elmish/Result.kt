package kodando.elmish

data class Result<out TModel, out TMessage>(
  val model: TModel,
  val command: Command<TMessage> = noCommand()
)
