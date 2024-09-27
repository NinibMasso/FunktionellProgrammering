package InlämningsuppgiftKotlin

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

class AoC20211201KtTest {

    var list = listOf(199,200,208,210,200,207,240,269,260,263)
    val fileName = "src/InlämningsuppgiftKotlin/AoC20211201/Datafile.txt"
    val list2: List<Int> = (File(fileName).readLines().map { it.toInt() })

    @Test
    fun countHowManyTimesIncreases() {
        val result = InlämningsuppgiftKotlin.AoC20211201.countHowManyTimesIncreases(list)
        val result2 = InlämningsuppgiftKotlin.AoC20211201.countHowManyTimesIncreases(list2)
        assertEquals(7,result)
        assertEquals(1532, result2)
    }

    @Test
    fun threeMeasurementWindows(){
        val result = InlämningsuppgiftKotlin.AoC20211201.threeMeasurementWindows(list)
        val result2 = InlämningsuppgiftKotlin.AoC20211201.threeMeasurementWindows(list2)
        assertEquals(5, result)
        assertEquals(1571, result2)

    }
}