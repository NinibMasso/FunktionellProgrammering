package Övningsuppgifter.Övn5

class Rectangle(val bredd: Double, val höjd: Double)

fun Rectangle.area() = bredd * höjd

fun Rectangle.omkrets() = bredd * 2 + höjd * 2

val rektangel1 = Rectangle(3.0, 4.0)

fun String.DoubleUp() = "$this $this"

fun String.PrintRepeat(i : Int) : String{
    var temp = ""
    for (i in 1 .. i){
        temp += "$this"
    }
    return temp
}

fun main(){
    println("Rektangelns area: ${rektangel1.area()} Rektangelns omkrets: ${rektangel1.omkrets()}")

    println("Hej".DoubleUp())

    println("Hallå".PrintRepeat(5))
}