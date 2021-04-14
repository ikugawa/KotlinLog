package jp.techacademy.tomoya.kotlinlog

abstract class Animal {
    var name: String
    var age: Int

    constructor(name: String, age: Int, hobby: String) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}