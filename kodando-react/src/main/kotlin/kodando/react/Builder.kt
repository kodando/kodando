package kodando.react

interface Builder<out T : ReactProps> {
    fun build(setter: PropSetter<T>): ReactElement?
}
