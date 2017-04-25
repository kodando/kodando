package kodando.react

interface Builder<out T : ReactProps> {
    operator fun invoke(setter: PropSetter<T>): ReactElement?
}
