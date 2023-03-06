package com.example.myapplication

class Animal(
    private val name: String) {
    companion object {
        const val MAX_UMUR = 50
    }

    fun sound() {
        println("Animal with $name sound: ")
    }
}

fun main() {
    val cat = Animal("Cat")
    cat.sound()
    println("Max age: ${Animal.MAX_UMUR}")
}