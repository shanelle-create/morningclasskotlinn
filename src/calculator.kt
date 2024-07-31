import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)

    println("Enter first value")
    val num1 = read.nextInt()

    println("Enter second value")
    val num2 =  read.nextInt()

    println("Enter operator (+,-,*,/)")
    val operator = read.next()

    when (operator) {
        "+" -> println("Result: ${num1+num2}")
        "-" -> println("Result: ${num1-num2}")
        "*" -> println("Result: ${num1*num2}")
        "/" -> {
            if (num2 != 0){
                println("Result: ${num1/num2}")
            }
            else{
                println("Error: Division by zero is not allowed")
            }

        }
        else -> println("Error: Invalid operator")
    }










}