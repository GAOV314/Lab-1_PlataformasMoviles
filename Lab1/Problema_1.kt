/**
 * Convierte numeros decimales negativos y positivos a binario
 * Tiene como parametros un numero de tipo entero
 * Retorna una cadena
 */
fun decimalToBinary(decimal: Int): String {
    if (decimal == 0) return "0"
    var decimalNumber = decimal
    if(decimal<0) decimalNumber = decimal*-1
    val binary = StringBuilder()
    while (decimalNumber > 0) {
        binary.append(decimalNumber % 2)
        decimalNumber /= 2
    }
    if (decimal<0)  binary.append(1) else binary.append(0)
    return binary.reverse().toString()
}

fun main() {
    var option = ""
    var loopCondition = true
    do{
        println("Ingrese una opción: \n1. Convertir decimal a binario.\n2. Salir del programa.")
        option = readlnOrNull().toString()

        if(option.equals("1")){

                println("Introduce un número decimal:")
                val decimal = readLine()?.toIntOrNull()

                if (decimal != null) {
                    val binary = decimalToBinary(decimal)
                    println("El número $decimal en binario es $binary")
                } else {
                    println("Por favor, introduce un número válido.")

            }
        }else{
            loopCondition = false
            println("Saliendo del programa...")
        }

    }while(loopCondition)
}
