package kodando.elmish

data class Program<in TArg, TModel, TMessage>(
    val init: (TArg) -> Result<TModel, TMessage>,
    val update: (TModel, TMessage) -> Result<TModel, TMessage>,
    val subscribe: (TModel) -> Command<TMessage>,
    val view: (TModel, Dispatch<TMessage>) -> View,
    val setState: (TModel, Dispatch<TMessage>) -> Unit,
    val onError: (Throwable) -> Unit
)
