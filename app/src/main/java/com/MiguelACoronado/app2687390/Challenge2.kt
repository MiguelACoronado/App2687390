package com.MiguelACoronado.app2687390

class Challenge2 {
}

fun main() {

    print("Ingrese el valor de la compra")
    var sale = readLine()!!.toFloat()
    var bolita = (1..4).random()

    var rojo:Double = sale*0.1
    var azul:Double = sale*0.3
    var amarilla:Double = sale*0.5


if(sale > 50000) {
    if (bolita == 1) {
        print("El color de su bolita es rojo y obtienes 10% de descuento en tu compra. \n el valor total de tu compra es de ${sale - rojo}")
    } else if (bolita == 2) {
        print("El color de su bolita es azul y obtienes 30% de descuento en tu compra. \n el valor total de tu compra es de ${sale - azul}")
    } else if (bolita == 3) {
        print("El color de su bolita es amarilla y obtienes 50% de descuento en tu compra. \n el valor total de tu compra es de ${sale - amarilla}")
    } else if (bolita == 4) {
        print("Su compra sale totalmente gratis")
    }
}else{
    print("Su compra no tiene ningun descuento")
}

}