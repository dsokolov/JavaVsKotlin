package me.ilich.javavskotlin

object KotlinApp {

    @JvmStatic fun main(arg: Array<String>) {

/*

        println("Vasia".sayHello())

        val q: Int? = 123456
        val w: Int? = 123456
        println(w == q)

        println("Kotlin: Hello world!")
        val summator = Summator(b = 1, a = 2)
        val s = "sum = ${summator.sum()}"
        println(s)
        val user = KotlinUser("1", 21)
        println(user.q)
        user.q = 100
        println(user.q)

        var ss: String? = null
        foo(ss!!)

        val a = if (s.length == 5) {
            10
        } else {
            8
        }
        val b = when (s) {
            "a" -> 1
            "b" -> 2
            else -> 3
        }
        for (i in 0..10) {

        }

        val func: (Int, Int) -> (Int) = { a, b ->
            a + b
        }
        func(1, 2)
        sum(1, 2)

        val list = listOf(1, 2, 3)
        mutableListOf("12")
        list.map { it + 1 }.sum()
*/

        var ssss = mapOf(
                1 to 2,
                3 to 1
        )

        val l: List<String>? = null
        val q = l?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }?.map { }
        println(q)
    }

    fun sum(a: Int, b: Int) {
        a + b
    }

    fun foo(s: String) {

    }

    class Summator(val a: Int, val b: Int) {
        fun sum() = a + b
    }


}