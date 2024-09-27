package InlämningsuppgiftKotlin.AoC20211201

import java.io.File

//Advent of code year 2021 day 1


fun countHowManyTimesIncreases(list: List<Int>) : Int{
    var count = 0
    for (i in 0..<list.size-1){
        if (list[i] < list[i+1]) count++
    }
    println(count)
    return count
}

fun threeMeasurementWindows(list : List<Int>) : Int{
    var count = 0
    for (i in 0..<list.size-3){
        val sum1 = list[i] + list[i+1] + list[i+2]
        val sum2 = list[i+1] + list[i+2] + list[i+3]
        if (sum1 < sum2){
            count++
        }
    }
    println(count)
    return count
}


fun main(){
    val fileName = "src/InlämningsuppgiftKotlin/AoC20211201/Datafile.txt"
    val list: List<Int> = (File(fileName).readLines().map { it.toInt() })
    countHowManyTimesIncreases(list)
    threeMeasurementWindows(list)

    //efter lösning hittat här: https://www.reddit.com/r/adventofcode/comments/r66vow/2021_day_1_solutions/
    // part 1
    println(list.windowed(2).count() {it.last() > it.first()})
    // part 2
    println(list.windowed(4).count { it.last() > it.first() })
}