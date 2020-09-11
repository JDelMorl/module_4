import java.text.DecimalFormat

fun main (args: Array<String>){
//    val tax = .07
//    val cost = 100
//
    val percent = DecimalFormat("00.00%")
    val money = DecimalFormat("$###,###.00")

//
//    var totalCost = cost * tax
//    var ourTestVar = twoDigits.format(totalCost)
//
//
//     println("Result: $ourTestVar")
    var total = 0
    var ans = 0

    do {
        println("Please enter the price of items, enter 0 to stop: ")
        print("Enter Your Choice: ")
        ans = readLine()!!.toInt()
        total += ans

    }while (ans != 0)

    var taxes = total *.025
    var tip = total * .175
    var realTotal = total + taxes + tip

    var formatTotal = money.format(total)
    var formatTaxes = money.format(taxes)
    var formatTip = money.format(tip)
    var formatReal = money.format(realTotal)
    println("Subtotal: $formatTotal\nTaxes: $formatTaxes\n" +
            "Tip: $formatTip\nTotal: $formatReal")


 }
