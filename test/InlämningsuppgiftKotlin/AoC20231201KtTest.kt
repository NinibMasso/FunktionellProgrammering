package InlämningsuppgiftKotlin


import InlämningsuppgiftKotlin.AoC20231201.partOne
import InlämningsuppgiftKotlin.AoC20231201.partTwo
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AoC20231201KtTest {
    val testList = listOf("1abc2", "pqr3stu8vwx","a1b2c3d4e5f" , "treb7uchet")
    val testList2 = listOf("two1nine", "eightwothree","abcone2threexyz", "xtwone3four",
        "4nineeightseven2", "zoneight234", "7pqrstsixteen")

    @Test
    fun partOne() {
        val result = partOne(testList)
        assertEquals(result, 142)
    }

    @Test
    fun partTwo(){
        val result = partTwo(testList2)
        assertEquals(result, 281)
    }
}