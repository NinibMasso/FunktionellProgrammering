package Övningsuppgifter.övn3

fun main(){
    var ran = (1..10).random()
    println("Gissa en siffra mellan 1 och 10")

    try {
        while (true){
            val guessed = readLine()?.toInt() ?:5

            if (ran == guessed){
                println("Det var rätt.")
                ran = (1..10).random()
                println("Gissa en siffra mellan 1 och 10")
            }
            else{
                if (ran > guessed){
                    println("För lågt, gissa igen")
                }
                else if (ran < guessed){
                    println("För högt gissa igen")
                }
            }
        }

    }
    catch (e : NumberFormatException){
        e.printStackTrace()
        println("Du måste skriva in ett nummer")
    }
    catch (e : Exception){
        e.printStackTrace()
        println("Okänt fel")
    }

}