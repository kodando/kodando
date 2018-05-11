package kodando.jest

abstract class Spec {

  @JsName("describe")
  fun describe(name: String, handler: () -> Unit) {
    kodando.jest.describe(name, handler)
  }

  @JsName("it")
  fun it(description: String) = It(description)

  @JsName("test")
  fun test(description: String) = Test(description)

}

