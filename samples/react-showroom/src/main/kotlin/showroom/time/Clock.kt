package showroom.time

import kodando.es6.JsDate
import kodando.react.*
import kodando.react.dom.*
import kodando.react.lifecycle.*
import org.w3c.dom.*
import kotlin.browser.window
import kotlin.js.Math

/**
 * Created by danfma on 22/04/17.
 */
class Clock : Component<Clock.Props, Unit>(), DidMount, WillUnmount, ShouldUpdate<Clock.Props, Unit> {
    private var timeId: Int? = null
    private var canvasElement: HTMLCanvasElement? = null

    override fun render(): ReactElement? {
        return canvas {
            width = props.width
            height = props.width
            refBy = { canvasElement = it as HTMLCanvasElement }
            style = styleOf {
                set("backgroundColor", "#333") // TODO should define it safely
            }
        }
    }

    override fun componentDidMount() {
        val canvasElement = this.canvasElement ?: throw Error("No canvas found!")
        val graphics = canvasElement.getContext("2d") as CanvasRenderingContext2D
        val radius = canvasElement.height / 2.toDouble()

        fun drawClock() {
            drawClock(graphics, radius)
        }

        timeId = window.setInterval(::drawClock, 1000)
        drawClock()
    }

    override fun componentWillUnmount() {
        if (timeId != null) {
            window.clearInterval(timeId!!)
        }
    }

    override fun shouldComponentUpdate(nextProps: Props, nextState: Unit): Boolean {
        return false
    }

    private fun drawClock(graphics: CanvasRenderingContext2D, radius: Double) {
        val innerRadius = radius * 0.9

        graphics.resetTransform()
        graphics.translate(radius, radius)

        drawFace(graphics, innerRadius)
        drawNumbers(graphics, innerRadius)
        drawTime(graphics, innerRadius)
    }

    private fun drawFace(graphics: CanvasRenderingContext2D, radius: Double) {
        graphics.beginPath()
        graphics.arc(0.0, 0.0, radius, 0.0, 2 * Math.PI)
        graphics.fillStyle = "white"
        graphics.fill()

        val gradient = graphics.createRadialGradient(0.0, 0.0, radius * 0.95, 0.0, 0.0, radius * 1.05)
        gradient.addColorStop(0.0, "#333")
        gradient.addColorStop(0.5, "white")
        gradient.addColorStop(1.0, "#333")

        graphics.strokeStyle = gradient
        graphics.lineWidth = radius * 0.1
        graphics.stroke()

        graphics.beginPath()
        graphics.arc(0.0, 0.0, radius * 0.1, 0.0, 2 * Math.PI)
        graphics.fillStyle = "#333"
        graphics.fill()
    }

    private fun drawNumbers(graphics: CanvasRenderingContext2D, radius: Double) {
        graphics.font = "${radius * 0.15}px arial"
        graphics.textBaseline = CanvasTextBaseline.MIDDLE
        graphics.textAlign = CanvasTextAlign.CENTER

        for (num in 1..12) {
            val angle = num * Math.PI / 6.0

            graphics.rotate(angle)
            graphics.translate(0.0, -radius * 0.85)
            graphics.rotate(-angle)
            graphics.fillText(num.toString(), 0.0, 0.0)
            graphics.rotate(angle)
            graphics.translate(0.0, radius * 0.85)
            graphics.rotate(-angle)
        }
    }

    private fun drawTime(graphics: CanvasRenderingContext2D, radius: Double) {
        val now = JsDate()
        val hour = now.getHours().toDouble() % 12
        val minute = now.getMinutes().toDouble()
        val second = now.getSeconds().toDouble()

        // drawing the hour
        val hourAngle = (hour * Math.PI / 6.0) + (minute * Math.PI / (6 * 60.0)) + (second * Math.PI / (360 * 60.0))
        drawHand(graphics, hourAngle, radius * 0.5, radius * 0.07)

        // drawing the minute
        val minuteAngle = (minute * Math.PI / 30.0) + (second * Math.PI / (30.0 * 60.0))
        drawHand(graphics, minuteAngle, radius * 0.8, radius * 0.07)

        // drawing the second
        val secondAngle = (second * Math.PI / 30.0)
        drawHand(graphics, secondAngle, radius * 0.9, radius * 0.02)
    }

    private fun drawHand(graphics: CanvasRenderingContext2D, angle: Double, length: Double, width: Double) {
        graphics.beginPath()
        graphics.lineWidth = width
        graphics.lineCap = CanvasLineCap.ROUND
        graphics.moveTo(0.0, 0.0)
        graphics.rotate(angle)
        graphics.lineTo(0.0, -length)
        graphics.stroke()
        graphics.rotate(-angle)
    }


    class Props : ReactProps() {
        var name: String by jsonProperty
        var width: Int by jsonProperty

        init {
            width = 300
        }
    }


    companion object : ComponentBuilder<Props>(Clock::class.js, ::Props)

}