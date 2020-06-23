package com.pramod

class Person(var name: String) {

    fun display() {
      //  fun main(args: Array<String>) {
            var a = 50
            var b = 40

            // here if-else returns a value which
            // is to be stored in max variable
            var max = if(a > b){
                print("Greater number is: ")
                a
            }
            else{
                print("Greater number is:")
                b
            }
            print(max)
        //}
        println("\n Name of the person is : ${name}")
    }
}