package com.MiguelACoronado.app2687390

class Conditionals {
}

fun main() {

    /*println("Ingrese el primer número")
    var num1 = readLine()!!.toInt()
    println("Ingrese el segundo número")
    var num2 = readLine()!!.toInt()

    if(num1 > num2){
        println("El número mayor es $num1")
    }else if(num1 == num2){
        println("Los número son iguales")
    }else{
        println("El número mayor es $num2")

    }*/

    /*var aleatory = (1..20).random()
    println("Ingrese un numero ")
    var num = readLine()!!.toInt()

    if(num in 1..20){
        println("Bien ")
        if (num < aleatory){
            println("$num es menor que $aleatory")
        }else{
            println("$num es mayor que $aleatory")
        }
    }else{
        println("Mal")
    }*/

    var aleatory = (1..50).random()

    when(aleatory){
        0-> println("El numero es: $aleatory No hay coincidencias")
        in 1..10 -> println("El numero es: $aleatory Hay 10 coincidencias")
        else -> println("El numero es: $aleatory Hay muchas coincidencias")
    }
}