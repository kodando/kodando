package kodando.react

object Ksx : KsxBuilder()

fun ksx(setter: PropSetter<ReactProps>): ReactElement? {
    return Ksx.build(setter)
}
