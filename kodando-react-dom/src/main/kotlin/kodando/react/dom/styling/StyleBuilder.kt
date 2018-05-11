package kodando.react.dom.styling

class StyleBuilder(vararg initialClasses: String) {

  var classes = arrayOf(*initialClasses)
    private set

  fun add(className: String?): StyleBuilder {
    if (className != null) {
      classes += className
    }

    return this
  }

  fun add(className: String?, predicate: Boolean?): StyleBuilder {
    if (predicate == true) {
      add(className)
    }

    return this
  }

  override fun toString(): String {
    return classes.joinToString(" ")
  }

}
