package ru.netology

fun main() {
    val minComission = 35.0 // минимальная комиссия
    val percent = 0.75 // процент %
    var amount = 3_000.0  // сумма перевода
    val commission: Double = if (minComission > (amount * percent / 100)) minComission else amount * percent / 100 // комиссия за перевод

    val remittance = amount - commission // денежный перевод

    println(remittance)

}