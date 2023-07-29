package com.example.app2687390

class Nequi(private val celular: String, private val clave: String) {
    private var saldoDisponible = 4500.0
    private var intentosRestantes = 3

    fun iniciarSesion(): Boolean {
        while (intentosRestantes > 0) {
            print("Ingresa tu número de celular: ")
            val celularIngresado = readLine()

            print("Ingresa tu clave de 4 dígitos: ")
            val claveIngresada = readLine()

            if (celular == celularIngresado && clave == claveIngresada) {
                println("¡Bienvenido a Nequi!")
                return true
            } else {
                intentosRestantes--
                if (intentosRestantes > 0) {
                    println("¡Upps! Parece que tus datos de acceso no son correctos. Tienes $intentosRestantes intentos más.")
                } else {
                    println("Acceso bloqueado. Por favor, inténtalo nuevamente más tarde.")
                }
            }
        }
        return false
    }

    fun mostrarSaldo() {
        println("Saldo disponible: $saldoDisponible")
    }

    fun realizarTransacciones() {
        if (!iniciarSesion()) {
            return
        }

        while (true) {
            println("\n------ Funcionalidades ------")
            println("1. Saca")
            println("2. Envía")
            println("3. Recarga")
            println("4. Salir")

            print("Ingrese el número de la opción que desea realizar: ")
            val opcion = readLine()?.toIntOrNull()

            when (opcion) {
                1 -> {
                    sacar()
                }
                2 -> {
                    enviarDinero()
                }
                3 -> {
                    recargar()
                }
                4 -> {
                    println("¡Hasta luego! Gracias por usar Nequi.")
                    return
                }
                else -> println("Opción inválida. Por favor, ingrese una opción válida.")
            }

            mostrarSaldo()
        }
    }

    private fun sacar() {
        println("\n------ Sacar ------")
        println("1. Cajero")
        println("2. Punto físico")

        print("Seleccione una opción: ")
        val opcion = readLine()?.toIntOrNull()

        if (saldoDisponible < 2000) {
            println("No te alcanza para hacer el retiro.")
            return
        }

        when (opcion) {
            1 -> {
                println("Ingrese la cantidad a retirar: ")
                val cantidad = readLine()?.toDoubleOrNull()
                if (cantidad != null && cantidad <= saldoDisponible) {
                    println("Retiro exitoso. Generando código de 6 dígitos...")
                    saldoDisponible -= cantidad
                } else {
                    println("Cantidad inválida o saldo insuficiente para el retiro.")
                }
            }
            2 -> {
                // Opción de punto físico, se puede implementar aquí si es necesario.
                println("Opción no implementada.")
            }
            else -> println("Opción inválida. Por favor, ingrese una opción válida.")
        }
    }

    private fun enviarDinero() {
        println("\n------ Envía ------")
        print("Ingrese el número de teléfono al que desea enviar dinero: ")
        val numeroTelefono = readLine()

        print("Ingrese el valor a enviar: ")
        val valorEnviar = readLine()?.toDoubleOrNull()

        if (valorEnviar != null && valorEnviar <= saldoDisponible) {
            println("Enviando dinero a $numeroTelefono por valor de $valorEnviar")
            saldoDisponible -= valorEnviar
        } else {
            println("Valor inválido o saldo insuficiente para enviar el dinero.")
        }
    }

    private fun recargar() {
        println("\n------ Recarga ------")
        print("Ingrese el valor a recargar: ")
        val valorRecargar = readLine()?.toDoubleOrNull()

        print("¿Está seguro de que desea realizar la recarga? (S/N): ")
        val confirmacion = readLine()?.uppercase()

        if (confirmacion == "S" && valorRecargar != null) {
            println("Recarga exitosa por valor de $valorRecargar")
            saldoDisponible += valorRecargar
        } else {
            println("Recarga cancelada.")
        }
    }
}

fun main() {
    val nequi = Nequi("3224233788", "1234")
    nequi.realizarTransacciones()
}