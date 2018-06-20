package kodando.react.dom.styling

class ClassNameBuilder(private var classes: Array<out String>) {

  fun add(className: String?): ClassNameBuilder {
    if (className != null) {
      classes += className
    }

    return this
  }

  fun add(className: String?, predicate: Boolean?): ClassNameBuilder {
    if (predicate == true) {
      add(className)
    }

    return this
  }

  override fun toString(): String {
    return classes.joinToString(" ")
  }

}

fun buildClassName(vararg classes: String) =
  ClassNameBuilder(classes)
