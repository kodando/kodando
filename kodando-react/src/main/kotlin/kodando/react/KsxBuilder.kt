package kodando.react

open class KsxBuilder : Builder<ReactProps> {
    override fun build(setter: PropSetter<ReactProps>): ReactElement? {
        return unsafePropsBy(setter).children?.firstAsElement()
    }
}
