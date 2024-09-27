package Övningsuppgifter

fun comparator(x: Int, y:Int) = if (x>y) "x är störst" else "y är störst"

fun main(){
    println(comparator(4,5))
    println(comparator(44,5))
}