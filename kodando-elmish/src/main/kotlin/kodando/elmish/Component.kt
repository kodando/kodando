package kodando.elmish

interface Component<in TArg, TModel, TMessage> {
    fun init(data: TArg): Result<TModel, TMessage>
    fun update(model: TModel, message: TMessage): Result<TModel, TMessage>
    fun render(model: TModel, dispatch: Dispatch<TMessage>): View
}
