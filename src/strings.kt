fun main(){
//    var s1 = "Thing"
//    var s2 = "thing"
//
//    var result = s1.compareTo(s2,ignoreCase = true)
//
//    if (result == 0) {
//        println("They are the same")
//    }else{
//        println("They are NOT the same")
//    }
//    println(s2.toLowerCase().capitalize())
//
//    println("the length of this string is ${s1.length}")
//    println("The first character is: ${s1[s1.length-1]}")
//
//    var  result1 = s1.indexOf(char = 'h')
//    println(result1)
//    println(s1.substring(result1, 3))
//
//    println(s1.contains(other = "hi",ignoreCase = true))
//    val w = s1.replace(oldValue = "thing", newValue = "other thing")
//    println(w)
    var a1 = "red"
    var u1 = ""

    var a2 = "cat"
    var u2 = ""

    var a3 = "yellow"
    var u3 = ""

    var a4 = "dog"
    var u4 = ""

    var a5 = "computer"
    var u5 = ""

    var ansRight = 0


    print("1)what color is a fire truck?: ")
    u1 = readLine().toString()
    var result1 = a1.compareTo(u1,ignoreCase = true)
    if (result1 == 0) {
        println("Correct\n")
        ansRight += 1
    }else {
        println("Incorrect\n")
    }

    print("2)what animal says MEOW?: ")
    u2 = readLine().toString()
    var result2 = a2.compareTo(u2,ignoreCase = true)
    if (result2 == 0) {
        println("Correct\n")
        ansRight += 1
    }else {
        println("Incorrect\n")
    }

    print("3)what color is a bus?: ")
    u3 = readLine().toString()
    var result3 = a3.compareTo(u3,ignoreCase = true)
    if (result3 == 0) {
        println("Correct\n")
        ansRight += 1
    }else {
        println("Incorrect\n")
    }


    print("4)what animal says WOOF-WOOF?: ")
    u4 = readLine().toString()
    var result4 = a4.compareTo(u4,ignoreCase = true)
    if (result4 == 0) {
        println("Correct\n")
        ansRight += 1
    }else {
        println("Incorrect\n")
    }

    print("5)what are device are you using right now?: ")
    u5 = readLine().toString()
    var result5 = a5.compareTo(u5,ignoreCase = true)
    if (result5 == 0) {
        println("Correct\n")
        ansRight += 1
    }else {
        println("Incorrect\n")
    }

    println("You answered $ansRight questions correct")

}