package ru.netology

fun main(){
    val result = paymentValue("Visa", 60000, 100)
    println("Операция на сумму " + result.toInt() + " рублей " + (result%100).toInt() + " копеек исполнена")
}


fun limitPerDay(paymentSystem: String): Int{
    val value: Int = when(paymentSystem){
        "VK Pay" -> 15000
        "Visa" -> 150000
        "Мир" -> 150000
        "Maestro" -> 150000
        "Mastercard" -> 150000
        else -> {0}
    }
    return value
}

fun limitPerMonth(paymentSystem: String): Int{
    val value: Int = when(paymentSystem){
        "VK Pay" -> 40000
        "Visa" -> 600000
        "Мир" -> 600000
        "Maestro" -> 75000
        "Mastercard" -> 75000
        else -> {0}
    }
    return value
}

fun comission(paymentSystem: String, payment: Int): Double{
    val value: Double = when(paymentSystem){
        "VK Pay" -> 0.0
        "Visa" -> (if (payment*0.0075 < 35) 35 else payment*0.0075) as Double
        "Мир" -> (if (payment*0.0075 < 35) 35 else payment*0.0075) as Double
        "Maestro" -> (if (payment > 75000) (payment*0.006+20) else 0) as Double
        "Mastercard" -> (if (payment > 75000) (payment*0.006+20) else 0) as Double
        else -> {0.0}
    }
    return value
}

fun paymentValue(paymentSystem: String, payment: Int, balance: Int): Double {
    if( payment > limitPerDay(paymentSystem) || payment > (limitPerMonth(paymentSystem) - balance)){
        return  0.0
    }
    else {
        return payment.toDouble() - comission(paymentSystem, payment)
    }
}