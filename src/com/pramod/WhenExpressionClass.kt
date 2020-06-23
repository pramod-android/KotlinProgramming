package com.pramod

import java.util.*

class WhenExpressionClass {

    fun whenAsStatementWithElse() {
        println("When As Statement With Else")
        var reader = Scanner(System.`in`)
        println("Enter word")
        var lb = reader.next()
        when (lb) {
            "Sun" -> println("Sun is a Star")
            "Moon" -> println("Moon is a Satellite")
            "Earth" -> println("Earth is a planet")
            else -> println("I don't know anything about it")
        }

    }

    fun whenAsExpression() {
        println("when as an expression")
        var reader = Scanner(System.`in`)
        print("Enter the month number:")
        var monthOfYear = reader.nextInt()
        var month = when (monthOfYear) {
            1 -> "January"
            2 -> "Febuary"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> {
                println("Not a month of year")
            }
        }
        println(month)
    }

    fun whenAsMultipleCombine() {
        println("Combine multiple branches in one using comma")
        var reader = Scanner(System.`in`)
        print("Enter name of planet: ")
        var name = reader.next()
        when (name) {
            "Mercury", "Earth", "Mars", "Jupiter"
                , "Neptune", "Saturn", "Venus", "Uranus" -> println("Planet")
            else -> println("Neither planet nor star")
        }
    }

    fun whenToCHeckInputValueInRange() {
        println("input value in range or not")
        var reader = Scanner(System.`in`)
        print("Enter the month number of year: ")
        var num = reader.nextInt()
        when (num) {
            in 1..3 -> println("It is spring season")
            in 4..6 -> println("It is summer season")
            in 7..8 -> println("It is rainy season")
            in 9..10 -> println("It is autumn season")
            in 11..12 -> println("It is winter season")
            !in 1..12 -> println("Enter valid month of year")
        }
    }

    fun whenToCheckVariableType() {
        print("variable is of certain type or not")
        var reader = Scanner(System.`in`)
        print("Enter value to ceck type: ")
        //   var value = reader.nextLine() as Any?
        var value = 100 as Any?
        when (value) {
            is Int -> println("Integer")
            is String -> println("String")
            is Double -> println("Double")
        }
    }

    fun isOdd(X: Int) = X % 2 != 0
    fun isEven(X: Int) = X % 2 == 0

    fun whenAsReplacementOfIfElseIfChain() {
        println(" when as replacement for an if-else-if chain ")
        var reader = Scanner(System.`in`)
        print("Enter integer value : ")
        var value = reader.nextInt()

        when {
            isOdd(value) -> println("Odd")
            isEven(value) -> println("Even")
            else -> println("Neither even nor odd")
        }

    }
    fun hasPrefix(company: Any) = when (company) {
        is String -> company.startsWith("Mr")
        else -> false
    }

    fun checkHasPrefix() {
        var company = "Mr Pramod"
        var result = hasPrefix(company)
        if(result) {
            println("Yes, string started with Mr")
        }
        else {
            println("No, String does not started with Mr")
        }
    }


}