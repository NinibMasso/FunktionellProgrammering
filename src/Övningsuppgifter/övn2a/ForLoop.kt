package Övningsuppgifter.övn2a

fun main(){
    for (i in 20 downTo 1) if (i %2 == 0)
        print("$i ")

    println()

    for (i in 20 downTo 1 step 2)
        print("$i ")

    println()
    multiplication(4)

    println(isThisAPrime(8))
    println(isThisAPrime(13))
    println(isThisAPrime(9))
    println(isThisAPrime(3))
    println(isThisAPrime(2))
    println(isThisAPrime(1))
}

fun multiplication(x : Int){
    for (i in 1..20 ) {
        print(x * i)
        print(" ")
    }

}

fun isThisAPrime(primeCandidate: Int) : Boolean{

    if (primeCandidate == 1 || primeCandidate == 2) return false

    for (x in 2..primeCandidate/2) {   /// eg. vill man skära bort alla siffror som inte är primtal
        if (primeCandidate % x == 0) return false
    }
    return true
}