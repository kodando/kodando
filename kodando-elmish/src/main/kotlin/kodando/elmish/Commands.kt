package kodando.elmish


fun <TMessage> noCommand(): Command<TMessage> = { }

fun <TOutMessage, TInMessage> Command<TInMessage>.map(
  messageConverter: (TInMessage) -> TOutMessage): Command<TOutMessage> {

  return { dispatch ->
    this { innerMessage ->
      dispatch(messageConverter(innerMessage))
    }
  }
}

fun <TMessage> batch(vararg commands: Command<TMessage>): Command<TMessage> {
  return { dispatch ->
    for (command in commands) {
      command(dispatch)
    }
  }
}
