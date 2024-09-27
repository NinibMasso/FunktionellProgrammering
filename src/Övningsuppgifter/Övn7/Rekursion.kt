package Övningsuppgifter.Övn7

fun fact(n:Long) : Long{
    if (n<= 1) return 1
    return n * fact(n-1)
}

fun factAcc(n : Long) : Long {
    fun factInnerAcc(acc: Long, n: Long): Long{
        if (n == 1L) return acc
        else return factInnerAcc(n*acc, n-1)
    }
    return factInnerAcc(1,n)
}

tailrec fun countInterest(amount: Double, year: Int, interest: Double) : Double{
    return if (year == 0) amount
    else countInterest((amount + amount*interest / 100), year-1, interest)
}

fun sum(ints:List<Int>) : Int {
    tailrec fun doSum(sum :Int, counter : Int): Int{
        return if (counter == -1) sum
        else doSum(sum+ints[counter], counter -1)
    }
    return doSum(0, ints.size-1)
}

fun findMax(ints:List<Int>) : Int {
    tailrec fun findMax2(max : Int, counter : Int): Int{
        return if (counter == -1) max
        else findMax2(if (ints[counter] > max) ints[counter] else max, counter-1)
    }
    val max = Int.MIN_VALUE
    return findMax2(max, ints.size-1)
}

fun reverse (line:String): String{
    if (line.isEmpty()) return ""
    return  reverse(line.takeLast(line.length-1)) + line.first()


}
fun main(){
    println(countInterest(100.0, 5, 10.0))
    println(sum(listOf(1, 5, 3, 4, 10, -3, 6)))
    println(findMax(listOf(1, 5, 3, 4, 10, -3, 6)))
    println(reverse("Hallå där"))

    tailrec fun fib(prevPrev: Int, prev: Int) {
        val next = prevPrev + prev
        println(next)
        if (next > 100) System.exit(0)
        fib(prev, next)
    }

    println(fib(1, 2))
}