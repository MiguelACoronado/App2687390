package com.MiguelACoronado.app2687390

class Cycles{

}

fun main() {

    /*for(i in 1..10){
        if (i%2 == 0){
            println(" ${i} es par ")
        }else{
            print(" ${i} es impar ")
        }
    }*/

   /* var par:Int = 0
    var impar:Int = 0
    var parsum:Int = 0
    var imparsum:Int = 0
    var volver:Int = 1

    if(volver == 1) {

        println("Ingrese un numero del 1 al 10")
        var num = readLine()!!.toInt()



        if (num%2 == 0){
            par = par + 1
            parsum = parsum + num
        }else {
            impar = impar + 1
            imparsum = imparsum + num
        }



        println("Desea seguir jugando? 1.si 2.no")
        volver = readLine()!!.toInt()
    }else if(volver == 2){
        println("Gracias por jugar")
    }

    println("El numero de pares fue ${par} y el numero de impares fue ${impar}")
    println("La suma total de los pares es ${parsum} y la suma total de los impares es ${impar}")*/


    var par:Int = 0
    var impar:Int = 0
    var parsum:Int = 0
    var imparsum:Int = 0


    do{

        var volver:Int = 0

        println("Ingrese un numero")
        var num = readLine()!!.toInt()

        if(num <= 0){
            continue
        }
        else if(num % 2 == 0){

            println("El numero $num es par")
            par = par + 1
            parsum = parsum + num
        }
        else {
            println("El numero $num es impar")
            impar = impar + 1
            imparsum = imparsum + num
        }

        println("Desea ingresar otro numero? 1.si 2.no")
        volver = readLine()!!.toInt()

    }while(volver == 1)

    println("El numero de pares fue ${par} y el numero de impares fue ${impar}")
    println("La suma total de los pares es ${parsum} y la suma total de los impares es ${impar}")
}