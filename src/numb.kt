import java.text.DecimalFormat

fun main (args: Array<String>){
//    val tax = .07
//    val cost = 100
// formatting
    val money = DecimalFormat("$###,###.00")

//
//    var totalCost = cost * tax
//    var ourTestVar = twoDigits.format(totalCost)
//
//
//     println("Result: $ourTestVar")
//empty variables
    var total = 0
    var ans = 0
// loop until 0 is entered
    do {
        println("Please enter the price of items, enter 0 to stop: ")
        print("Enter Your Choice: ")
        ans = readLine()!!.toInt()
        total += ans

    }while (ans != 0)
// processing
    var taxes = total *.025
    var tip = total * .175
    var realTotal = total + taxes + tip
//    formatting
    var formatTotal = money.format(total)
    var formatTaxes = money.format(taxes)
    var formatTip = money.format(tip)
    var formatReal = money.format(realTotal)
//    final print
    println("Subtotal: $formatTotal\nTaxes: $formatTaxes\n" +
            "Tip: $formatTip\nTotal: $formatReal")


 }
