package com.example.bank

fun main() {
    val manishBankAccount = BankAccount(accountHolder = "Manish Mandrai", balance = 1000.0)

//    println(manishBankAccount.accountHolder)
    manishBankAccount.deposit(200.00)
    manishBankAccount.withdraw(2250.00)
    manishBankAccount.deposit(4350.00)
    manishBankAccount.deposit(100.00)
    manishBankAccount.withdraw(3340.00)

    manishBankAccount.displayTransectionHistory()
    println("${manishBankAccount.accountHolder}'s balance is ${manishBankAccount.balance}")
}
