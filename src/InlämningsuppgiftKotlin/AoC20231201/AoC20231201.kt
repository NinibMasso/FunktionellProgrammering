package InlämningsuppgiftKotlin.AoC20231201

import java.io.File
fun partOne(list : List<String>) : Int{
    val tempList = mutableListOf<Int>()
    for (i in 0 .. list.size-1){
        val temp = list[i].firstOrNull { it.isDigit()}.toString() + list[i].lastOrNull { it.isDigit() }.toString()
        val tempInt = temp.toInt()
        tempList.add(tempInt)
    }
    return tempList.sum()
}
val bokstäverTillSiffra = mapOf(
    "one" to 1, "1" to 1, "two" to 2, "2" to 2, "three" to 3, "3" to 3, "four" to 4, "4" to 4,
    "five" to 5, "5" to 5, "six" to 6, "6" to 6,"seven" to 7, "7" to 7,"eight" to 8, "8" to 8,
    "nine" to 9, "9" to 9
)
val allaSiffror = bokstäverTillSiffra.keys
fun partTwo(list : List<String>) : Int {

    return list
        .map { convertToInt(it.findAnyOf(allaSiffror)!!) * 10 + convertToInt(it.findLastAnyOf(allaSiffror)!!) }
        .sum()
    }
fun convertToInt(pair: Pair<Int, String>): Int {
    return bokstäverTillSiffra[pair.second]!!
}
//Efter sökning på nätet hittat en ENradslösning via denna url:
// https://www.reddit.com/r/adventofcode/comments/1883ibu/2023_day_1_solutions/
fun partThree(list: List<String>) = list.sumOf {
    line -> "${bokstäverTillSiffra[line.findAnyOf(bokstäverTillSiffra.keys)?.second]}${bokstäverTillSiffra[
    line.findLastAnyOf(bokstäverTillSiffra.keys)?.second]}".toInt()
}
fun main() {
        val fileName = "src/InlämningsuppgiftKotlin/AoC20231201/DataFileAoC20231201.txt"
        val list = (File(fileName).readLines())
        println(partOne(list))
        println(partTwo(list))
        println(partThree(list))
}