package com.deepu.basicsofkotlin

fun main() {
/*     var myname = "deepu"
    myname = "Is Goat"
    print("Virat Kohli " + myname)

 */


    // no need to specify datatype ...will automatically detect....
    // Difference between val and var is that val cannot be reassigned and var can be..


    /*
    var age = 34 // if not specified than the datatype will be int ......
    age = 35
    var age2: Byte = 12
    var age3: Short = 56
    var age4: Long = 3545667
    var age6: Long = 34_34_34_5365_24 // u can use underscore in long,int,float,double  to make it readable
    var age5: Int = 12342
    var money = 13.37  // it is okay....
    print(age6)

    */


//var money2:Float = 13.36 // but here it show error becoz auto datatype is double if u want that float u need to do the following


    /*
    var money3: Float = 13.36F
    var money4: Double = 124.432
    var isSunny: Boolean = true // no need to specify boolean
    var isSunny = true
    isSunny = false
    var letterChar = 'a'
    var numberChar = '1'
    letterChar = '!'

   */


    /*

    var myStr = "Deepu"
    var firstletterinString = myStr[0]
    var lastletterinstring = myStr[myStr.length - 1]
    print("first character $firstletterinString")
    print("$lastletterinstring")

    // suppose you want to print the length of string ...simplest way is create a variable and assign value = mystr.length
    // another way


 print("length of my string is $myStr.length") // its not working becoz syntax is wrong
    print("  length of my string is ${myStr.length}")  // correct

  */


//    Arithmetic operator

    /*
     var result= 5+3
    result /= 4
    println(  result) // leaving here space will not count in output
    var age7 :Byte
    age7 = 6
    var isequal = 5==3
    var isEqual = 5==5
    println(isequal)

    println(isEqual) // println if used then it will print the result and then the next print statement will executed in next line


    println("${5>3}")
    println("${-5>3}")

//    print({5>3}) // wrong syntax

    var mynum = 32
    mynum++
    println(mynum)
    println("$mynum")
    // println(mynnum++) // wrong syntax
    println("${mynum++}")
    println("${++mynum}")


     */


    /*

    // if - else if - else all have same syntax as of c++......

    val height = 7
    if(height>=6)
    {
        println("you are tall")
    }
    else if(height>=12){
        println("very tall")
    }

     */


    // when statement is equivalent of switch case in c++
    // but when is more powerful tool than switch case...


/*

    var season  = 3
    when (season) {
        1 -> println("spring")
        2 -> println("summer")
        3 -> {
            println("fall")
            println("autumn")
        }
        4 -> println("winter")
        else -> println("Invalid season")
    }





 */


    /*
    in upper case u used only single value to decide the result suppose you have
    a range or specific 2 or 3 condition than u can do the following


    Suppose a que
    given month and you want to print season based on month

 */


    /*

 var month = 1
    when (month) {
        in 3..5 -> println("spring")
        in 6..8 -> println("summer")
        in 9..11 -> println("Fall")
        // in 12..2 -> println("winter") // this make no sense what is range 12 to 2..we want to get 12,1,2 but laptop not understand this
        12,1,2 -> println("Winter")
    }


     */


// if you want to write range from highest to lowest u need to write like this......11 downTo 8.....


    /*
    !in 0..20 ...if you write like this it mean if not in range of 0 to 20 then perform that
    particular function...
    */

// when statement also ued to check the datatype of variable....

/*
  var x: Any = 13.37f
    when (x) {
        is Int -> println("$x is an int")
        is Double -> println("$x is an Double")
        is String -> println("$x is an String")
        else -> println("$x not an int double or string")
    }


 */


    //while loop


    /*var x=1
    while(x<=10){
        print("$x ")
        x++
    }

print("\nwhile loop is done")



     */


//do while loops
// same syntax....will at least run once....


    // for loops..

    // to print no from 1 to 10



    /*
    for(num in 1..10){
        print("$num ")
    }

    // same result will come in this type also but will not print last value
    for(i in 1 until 10)  // same as for(i in 1.until(10))
    {
        print("$i ")
    }
    print("\n")
    for(f in  10 downTo 1){
        print("$f ")

    }
  // what if you want to print in difference of 2
    for(j in 10 downTo 1 step 2)   //  same as for(j in 10.downTo(1).step(2))
        {
 print("$j ")
    }


     */


    // break and continue work in same way



     myfunction()


    val result = addUp(5,5)
    print("$result")



    val averageTwoNumber = avg(5.23,5.45)

    //  you have selected double type as argument so you need to pass double


    // its not like c++ that if you pass int it will automatically convert it to double or float....

      println("$averageTwoNumber")

}
fun myfunction(){
    println("user created function") // simple function
}

fun addUp(a:Int , b:Int): Int{
    return a+b
}

fun avg(a:Double , b:Double):Double{
    return (a+b)/2
}