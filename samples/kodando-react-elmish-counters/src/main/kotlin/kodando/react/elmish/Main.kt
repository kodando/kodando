package kodando.react.elmish

import kodando.elmish.createProgram
import kodando.elmish.react.useReact

external val module: dynamic

fun main(args: Array<String>) {
    val counters = arrayOf(1, 2, 3)

    val program =
        createProgram(Counters)
            .useReact("#application")
            .startWith(counters)

    if (module.hot) {
        module.hot.accept()
        module.hot.dispose {
            program.dispose()
        }
    }
}
