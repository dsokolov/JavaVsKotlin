package me.ilich.javavskotlin

object KotlinApp {

    @JvmStatic fun main(arg: Array<String>) {
        println("Kotlin: Hello world!")
        val summator = Summator(1, 2)
        val s = "sum = ${summator.sum()}"
        println(s)
    }

    class Summator(val a: Int, val b: Int) {
        fun sum() = a + b
    }

}