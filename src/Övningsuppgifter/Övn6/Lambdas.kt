package Övningsuppgifter.Övn6

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
    myDjurList.forEach { e -> e.printDjur() }
    println()

    myDjurList.forEach { it.printDjur() }
    println()

    fun görOmTillGrodor(list : List<Djur>) : List<Djur>{
        return list.map{Djur("Groda",4)}
    }
    var myGrodList = görOmTillGrodor(myDjurList)

    myGrodList.forEach { it.printDjur() }

    fun sorteraBortSpindlar(list : List<Djur>) : List<Djur>{
        return list.filter { it.sort != "Spindel" }
    }
    var filteredList = sorteraBortSpindlar(myDjurList)
    println()
    filteredList.forEach { it.printDjur() }

    fun finnsDetKatter(list : List<Djur>) : Boolean{
        return list.any { it.sort == "Katt" }
    }
    println(finnsDetKatter(myDjurList))
    println(finnsDetKatter(myGrodList))

    fun maxLegs(list : List<Djur>) : Djur{
        return list.maxBy { it.antalBen }
    }

    var maxLegs = maxLegs(myDjurList)
    println(maxLegs.sort + " " + maxLegs.antalBen)

    fun howManyInsects(list: List<Djur>) : Int{
        return list.count(){ it.antalBen > 4}
    }
    println()
    println(howManyInsects(myDjurList))

    fun doubleAnimals(list : List<Djur>) : List<Djur>{
        val doubledList = mutableListOf<Djur>()
        list.forEach {  doubledList.add(it); doubledList.add(it) }
        return doubledList
    }
    val doubleddList = doubleAnimals(myDjurList)
    doubleddList.forEach { it.printDjur()}
}

