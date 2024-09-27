package InlämningsuppgiftKotlin.AoC20211202

import java.io.File
fun calculatePosition(list: List<String>): Int {
    var horizontal = 0
    var depth = 0
    for (i in list) {
        val (text, numberStr) = i.split(" ")
        val number = numberStr.toInt()
        when (text) {
            "forward" -> horizontal += number
            "down" -> depth += number
            "up" -> depth -= number
        }
    }
    return horizontal * depth
}
fun calculatePosition2(list: List<String>): Int {
    var horizontal = 0
    var depth = 0
    var aim = 0
    for (i in list) {
        val (text, numberStr) = i.split(" ")
        val number = numberStr.toInt()
        when (text) {
            "forward" -> {
                horizontal += number
                depth += (number * aim)
            }
            "down" -> aim += number
            "up" -> aim -= number
        }
    }
    return horizontal * depth
}

/*Jag har kollat runt på nätet och hittar inte jättestora skillnader mellan min lösning och andras. De flesta har
     använt sig av when satser för att lösa denna uppgift. Däremot så läser man in datafilen lite olika och mappar upp
     lite olika. Jag tycker att min lösning är ändå ganska simpel och tydlig.
     Men ett exempel kommer här: https://github.com/vini2003/Advent-of-Code-2021/blob/dev/src/main/kotlin/dev/vini2003/adventofcode/solution/Day2Solution.kt
     */

fun EfterLösningPart1(list : List<String>) : Int{
    var horizontal = 0
    var depth = 0
    list.forEach { line ->
        val value = line.substringAfter(' ').toInt()
        when (line[0]){
            'f' -> horizontal += value
            'u' -> depth -= value
            'd' -> depth += value
        }
    }
    return horizontal * depth
}

fun EfterlösningPart2(list : List<String> ): Int{
    var aim = 0
    var depth = 0
    var horizontal = 0
    list.forEach { line ->
        val value = line.substringAfter(' ').toInt()
        when (line[0]){
            'f' -> {
                horizontal += value
                depth += value * aim
            }
            'u' -> aim -= value
            'd' -> aim += value
        }
    }
    return horizontal * depth
}
fun main() {
    val fileName = "src/InlämningsuppgiftKotlin/AoC20211202/DataFileAoC20211202.txt"
    val list = (File(fileName).readLines())
    println(calculatePosition(list))
    println(calculatePosition2(list))
    println(EfterLösningPart1(list))
    println(EfterlösningPart2(list))
}