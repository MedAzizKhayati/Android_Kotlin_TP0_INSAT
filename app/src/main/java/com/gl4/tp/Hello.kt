package com.gl4.tp


private val languages = listOf(
    "C++", "C#", "Java", "Kotlin", "Python",
    "Javascript", "Go", "Solidity", "PHP", "Ruby On Rails", "R"
)

fun main(argv: Array<String>) {
    val name = "Aziz"
    print("Hello $name\n")

    val message: String? = "My message can possibly be null !"
    print(message?.uppercase())

    correct()

    print(add(2, 6))

    sayMyName("Aziz")

    sayHello()

    println("Languages :")
    showList(languages)
    println("Odd Numbers to 10 :")
    oddNumbersTo10()

    println("\nCalculate fun: ${calculate(15, 16, '+')}")
}

fun correct() {
    var hello = "Hello" // val => var
    hello = "Hello world!"

    println(hello)

    val toto = "Toto" // Int => "" - var => val

    println(toto)

    var message: String? = "I’m learning Kotlin!"
    message = null
    println(message.toString())
}

fun add(a: Int, b: Int) = a + b

fun sayMyName(name: String) {
    println(" $name ")
}

fun sayHello() = "Hello"

fun showList(list: List<String>) {
    for (i in list.indices)
        print("${list[i]} ")
    println()
}

fun oddNumbersTo10() {
    for (n in 1..10 step 2)
        print("$n ")
}

fun calculate(a: Int, b:Int, op: Char): Int? {
    return when(op) {
        '+' -> (a + b)
        '*' -> (a * b)
        '-' -> (a - b)
        '/' -> (a / b)
        '%' -> (a % b)
        else -> null
    }
}