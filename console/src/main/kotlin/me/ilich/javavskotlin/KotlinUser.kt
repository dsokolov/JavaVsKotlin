package me.ilich.javavskotlin

data class KotlinUser(
        var name: String,
        var age: Int) {

    var l1 = listOf<Int>()
    val l2 = mutableListOf<Int>()

    var q: Int = 1
        get() {
            if (field > 9) {
                return 0
            } else {
                return field
            }
        }
        set(value) {
            if (value > 99) {
                field = 10
            } else {
                field = value
            }
        }


}

