package kodando.elmish

interface Component<TArg, TModel, TMessage> {
    fun init(arg: TArg): Result<TModel, TMessage>
    fun update(model: TModel, message: TMessage): Result<TModel, TMessage>
    fun render(model: TModel, dispatch: Dispatch<TMessage>): View
}
