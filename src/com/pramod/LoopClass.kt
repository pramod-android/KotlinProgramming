package com.pramod

class LoopClass{
    fun whileLoop(){

        println("Print numbers 1 to 10")
        var number=1
        while (number<=10){
            println(number)
            number++
        }

        println("Print elements of array")
        var names = arrayOf("Praveen","Gaurav","Akash","Sidhant","Abhi","Mayank")
        var index=0
        while (index <names.size){
            println(names[index])
            index++
        }
    }

    fun forLoop(){
        println("Iterate through range")
        for(i in 1..6){
            println(i)
        }

        println("Iterate through range to jump using step-3")
        for(i in 1..10 step  3){
            println(i)
        }

        println("Iterate through Range from top to down with using downTo")
        for(i in 10 downTo 1){
            println(i)
        }


        println("Iterate through Range from top to down with using downTo and step 3")
        for(i in 10 downTo 0 step 3){
            println(i)
        }

        println("Traverse an array with using index property:")
        var planets= arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")
        for(i in planets.indices ){
            println(planets[i])
        }

        println("Traverse an array using withIndex() Library Function:")
        for((index,value) in planets.withIndex()){
            println("Element at $index th index is $value ")
        }

        println("Iterate through string using for loop –")

        var name = "Pramod"
        var name2 = "Patil"

        // traversing string without using index property
        for(alphabet in name)
            print(alphabet + " ")

        print(" ")

        // traversing string with using index property
        for(i in name2.indices) print(name2[i]+" ")
        println()

        // traversing string using withIndex() library function
        for((index,value) in name.withIndex())
            println("Element at $index th index is $value")

        println("Iterate through collection using for loop –")

        // read only, fix-size
        var collection = listOf(1,2,3,"listOf", "mapOf", "setOf")
        for (element in collection) {
            println(element)
        }


    }


}
