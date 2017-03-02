package sample

import kodando.rxjs.*

/**
 * Created by danfma on 01/03/2017.
 */

fun main(args: Array<String>) {
    val subject = Rx.Subject<Int>()

    subject.subscribe(
        next = {
            console.log("PUBLISHED", it)
        }
    )

    subject.debounceTime(2000).subscribe(
        next = {
            console.log("A LITTLE LATER", it)
        }
    )

    subject.next(1)
    subject.next(2)

    Rx.Observable.of(Unit).delay(3000).take(1).subscribe(
        next = {
            subject.next(3)
        }
    )
}
