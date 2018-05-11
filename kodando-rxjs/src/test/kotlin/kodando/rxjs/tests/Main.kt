package kodando.rxjs.tests

import kodando.rxjs.tests.operator.ConcatOperatorSpec
import kodando.rxjs.tests.operator.DeferOperatorSpec
import kodando.rxjs.tests.operator.MergeOperatorSpec

/**
 * Created by danfma on 03/05/17.
 */

fun main(args: Array<String>) {
  arrayOf(
    // factories
    ObservableCreateSpec,
    ObservableBindCallbackSpec,
    ObservableCombineLatestSpec,
    ObservableIntervalSpec,
    ObservableFromPromiseSpec,
    ObservableEmptySpec,
    ObservableFromSpec,
    ObservableFromPromiseSpec,
    ObservableExtensionsSpec,

    // operators
    ConcatOperatorSpec,
    DeferOperatorSpec,
    ObservableEmptySpec,
    MergeOperatorSpec
  )
}
