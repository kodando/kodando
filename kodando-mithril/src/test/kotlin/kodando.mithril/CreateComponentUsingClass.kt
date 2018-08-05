package kodando.mithril

import kodando.jest.Spec
import kodando.jest.expect
import kodando.mithril.elements.button
import kodando.mithril.elements.div
import kodando.mithril.elements.span
import org.w3c.dom.events.Event
import kotlin.browser.document

class CreateComponentUsingClassSpec : Spec() {

  private class CounterByClass : View<CounterByClass.Props> {

    interface Props : kodando.mithril.Props {
      var count: Int
      var onClick: (Event) -> Unit
    }

    override fun view(vnode: VNode<Props>): VNode<*>? {
      val props = vnode.attrs ?: return null

      return root {
        div("counter") {
          span {
            content(props.count)
          }

          button {
            type = "button"
            onClick = props.onClick
            content("Increment")
          }
        }
      }
    }

  }

  private fun Props.counterByClass(count: Int, applier: Applier<CounterByClass.Props>) {
    addChild(CounterByClass::class) {
      this.count = count
      applier()
    }
  }

  init {
    describe("Component using a class") {
      it("should be able to create a new vnode") byChecking {
        val node = root {
          counterByClass(1) {

          }
        }

        expect(node).toBeDefined()

        val container = document.createElement("div").also {
          render(it, node!!)
        }

        expect(container.innerHTML.trim()).toBe(
          """<div class="counter"><span>1</span><button type="button">Increment</button></div>"""
        )
      }
    }
  }

}
