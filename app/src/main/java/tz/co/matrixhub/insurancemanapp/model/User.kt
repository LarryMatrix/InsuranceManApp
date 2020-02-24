package tz.co.matrixhub.insurancemanapp.model

class User {
    var name: String = "";
    var age: Int = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return super.toString()
    }
}