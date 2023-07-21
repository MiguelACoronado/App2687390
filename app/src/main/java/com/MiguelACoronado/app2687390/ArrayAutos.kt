package com.MiguelACoronado.app2687390

class ArrayAutos {

}

fun main() {

    //Creation array

    val cars = arrayListOf<String>()

    //Creation functions

    //Register cars
    fun RegisCar(){
        println("Escriba el nombre del auto que desee agregar")
        var nameCar = readLine()!!.toString()

        if(nameCar in cars){
            println("Este auto ya existe")
        }else {
            cars.add(nameCar)
        }
    }

    //List cars

    fun ListCar() {
        for ((index, element) in cars.withIndex()) {
            println("El auto en la posicion $index es $element")
        }
    }

    //Search Car

    fun SearchCar(){

        println("Escriba el nombre del carro que desea buscar")
        var car = readLine()!!.toString()

        if(car in cars){
            println("El carro $car si esta registrado")
        }else{
            println("El carro no existe aún")
        }

    }

    //Modify Car

    fun ModiCar(){
        println("Que carro desea modificar?")
        var car = readLine()!!.toInt()

        println("Que valor desea agregar?")
        var carN = readLine()!!.toString()

        cars[car] = carN




    }

    //Eliminate Car

    fun ElimCar(){

        println("Que carro desea eliminar")
        var car = readLine()!!.toInt()

        cars.removeAt(car)
    }

    //Delete List

    fun DeleteList(){
        cars.clear()
    }

    //Creation ciclo
    do{

        println("Que accion desea realizar? 1.registrar 2.listar 3.buscar 4.modificar 5.eliminar 6.borrar lista")

        var i = readLine()!!.toInt()

        when(i){

            1-> RegisCar()
            2-> ListCar()
            3 -> SearchCar()
            4 -> ModiCar()
            5-> ElimCar()
            6-> DeleteList()

        }

        println("Desea seguir? 1.si 2.no")
        var repeat = readLine()!!.toInt()
    }while(repeat == 1)







}