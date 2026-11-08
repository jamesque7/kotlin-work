// Task 15.2.3: demo program

fun main() {
    val savingsAcc = SavingsAccount("James Quek", 1.8)

    savingsAcc.deposit(1250)
    savingsAcc.applyInterest()
    savingsAcc.applyInterest()
    savingsAcc.applyInterest()
    savingsAcc.applyInterest()
    savingsAcc.applyInterest()
    savingsAcc.withdraw(50)

    println(savingsAcc.balance)
}
