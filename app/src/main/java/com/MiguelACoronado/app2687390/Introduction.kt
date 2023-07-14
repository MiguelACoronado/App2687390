package com.MiguelACoronado.app2687390

class Introduction {
}

fun main() {

    //comentario en linea//

    /*comentario
    * en
    * bloque*/
    //print("hola mundo")

    //tipos de variables

    //var name:String = "Miguel"
    var num:Int = 2
    var long:Long = 6230794637046123047
    var short:Short = 6237
    var byte:Byte = 32
    var double:Double = 1.0
    var float:Float = 1.51F
    var char:Char = '-'
    var boolean:Boolean = true

    //print(float)

    print("Ingrese el nombre")
    var name:String = readLine()!!
    print("Ingrese el apellido")
    var lastname:String = readLine()!!
    print("Ingrese la edad de ${name}")
    var age = readLine()!!.toInt()

    println("En 10 años ${name}${lastname} tendrá \n ${age+10}")
}