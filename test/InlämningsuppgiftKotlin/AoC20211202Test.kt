package InlämningsuppgiftKotlin

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AoC20211202Test {

    val list = listOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")
    @Test
    fun calculatePosition() {
        val result = InlämningsuppgiftKotlin.AoC20211202.calculatePosition(list)
        assertEquals(150, result)

    }

    @Test
    fun calculatePosition2(){
        val result = InlämningsuppgiftKotlin.AoC20211202.calculatePosition2(list)
        assertEquals(result, 900)
    }
}