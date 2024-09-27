package Övningsuppgifter.övn4

class Djur(val sort: String, val antalBen : Int){
    fun printDjur() = println("Sort: $sort Antal Ben: $antalBen")
}
val hund = Djur("Hund", 4)
val katt = Djur("Katt", 4)
val spindel = Djur("Spindel", 8)
val häst = Djur("Häst", 4)
val myra = Djur("Myra", 6)

val myDjurList = listOf(hund, katt, spindel, häst, myra)

val mySet = setOf(hund, katt, spindel, häst, myra, hund, katt, spindel, häst, myra,hund, katt, spindel, häst, myra)
val mySecondSet = setOf(myra, katt, hund, spindel, häst)

val myMap = mapOf("Blixten" to hund, "Niro" to katt, "Rocky" to spindel, "Zebra" to häst, "Antman" to myra)

fun djurLäten(djur: Djur){
    when(djur){
        hund -> println("Voff!")
        häst -> println("iHIHIIH!")
        spindel -> println("asdsadsa")
        katt -> println("Mjau!")
        myra -> println("...")
    }
}

fun main(){
    //myra.printDjur()
    //spindel.printDjur()
    //häst.printDjur()
    //katt.printDjur()
    //hund.printDjur()
    myDjurList.forEach { e -> e.printDjur() }
    println()
    mySet.forEach { e -> e.printDjur() }
    println()
    mySecondSet.forEach { e-> e.printDjur() }
    println(mySet.equals(mySecondSet))
    println()

    for ((key, value) in myMap) println("$key, ${value.sort}, ${value.antalBen}")
    println()

    djurLäten(myra)
    djurLäten(häst)
    djurLäten(hund)
    djurLäten(katt)
    djurLäten(spindel)
}

