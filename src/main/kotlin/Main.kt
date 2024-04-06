
import java.time.LocalTime
import java.time.format.DateTimeFormatter
fun getCurrentTime(): LocalTime {
    return LocalTime.now()
    display()
}
fun displayTime(time: LocalTime) {
    val formatter = DateTimeFormatter.ofPattern("HH:MM:SS")
    println("Current time: ${time.format(formatter)}")
}
fun main() {
    while (true) {
        val currentTime = getCurrentTime()
        displayTime(currentTime)
        Thread.sleep(1000)
    }
    val myClock=Clock(10,30,30)
    myClock.show()
}
data class Clock(var hour: Int,var minute: Int,var second: Int){
    fun show() = println("Time:$hour:$minute:$second")

}
data class Calender(var day: String,var month: String, var year: Int)













