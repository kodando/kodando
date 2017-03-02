package kodando.mobx

/**
 * Created by danfma on 17/01/2017.
 */

fun <T> T.makeObservable() {
	Mobx.extendObservable(this, this)
}
