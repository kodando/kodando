package kodando.react

open class KsxBuilder : Builder<ReactProps> {
    operator override fun invoke(setter: PropSetter<ReactProps>): ReactElement? {
        return unsafePropsBy(setter).children?.firstAsElement()
    }
}
