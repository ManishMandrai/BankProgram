package com.example.bank

class BankAccount(var accountHolder : String, var balance : Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("Manish Deposited: $$amount")
    }
    fun withdraw(amount: Double) {
        if (amount<= balance){
            balance-= amount
            transactionHistory.add("$accountHolder withdraw $$amount")
        }else{
            println("Insufficient funds")
        }
    }
    fun displayTransectionHistory(){
        println("transection history for $accountHolder")
        for(transection in transactionHistory){
            println(transection)
        }
    }
}