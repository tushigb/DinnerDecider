package com.miu.dinnerdecider

open class Foods {
    private var dinners = ArrayList<String>()

    init {
        this.dinners =
            ArrayList(arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese"))
    }

    open fun addFood(food: String) {
        dinners.add(food)
    }

    open fun getRandomFood(): String {
        return dinners.random()
    }
}