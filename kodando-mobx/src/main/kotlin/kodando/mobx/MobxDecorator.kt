package kodando.mobx

import kodando.es6.MethodDecorator
import kodando.es6.PropertyDecorator

@JsModule("kodando/mobx")
@JsNonModule
external object MobxDecorator {

    @JsName("observable")
    val observable: PropertyDecorator

    @JsName("computed")
    val computed: PropertyDecorator

    @JsName("action")
    val action: MethodDecorator

}