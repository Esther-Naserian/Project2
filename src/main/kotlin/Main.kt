
fun main(){
    println(time(12,30,23))


}
data class dateTime(
var years: Int,
var months: Int ,
var days: Int ,
var  hours: Int ,
var minutes: Int ,
var seconds: Int ,
)

data class Clock(var minute: Int = 0, var hour: Int = 60) {
    fun show() = println("hour : $hour, minute : $minute")
    val minutes =  60
    var seconds= 60
}
fun time(hour: Int, minute: Int, second: Int = 0): Int {
var minutes = 60
    var seconds = 60
    var hours = 24

}







