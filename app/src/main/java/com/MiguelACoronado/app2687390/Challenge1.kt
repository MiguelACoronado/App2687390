package com.MiguelACoronado.app2687390

class Challenge1 {
}

fun main() {

    var crap = (1..6).random()
    var crap1 = (1..6).random()
    var sum:Int = crap + crap1


    if(crap == 1 && crap1 == 1){
        print("Ganaste por que los dos dados tienen 1")
    }else if(sum == 3){
        print("Ganaste porque la suma de los dados es 3")
    }else if(sum == 11){
        print("Ganaste porque la suma de los dados es 11")
    }else if(sum == 2 && sum == 12){
        print("Ganaste porque la suma de los dados es 2 o 12")
    }else if(sum == 7){
        print("Ganaste porque la suma de los dados es 7")
    }else{
        println("Perdiste")
    }

}