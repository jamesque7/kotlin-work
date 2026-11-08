package comp2850.banking

class StudentAccount(holder: String) : BankAccount(holder){
    var overdraft: Int = 0
        set(value){
            require(value<=100 && value>=0){"Invalid Overdraft"}
            field = value
        }

    val min get() = 0-overdraft

    override fun withdraw(amount: Int) {
        require(amount>0){"Withdrawal amount must be greater than 0"}

        if(balance-amount<min){
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }else{
            balance = balance-amount
        }
    }

    fun withdrawalsAllowed(): Boolean{
        if(balance == 0-overdraft){
            return false
        }else{
            return true
        }
    }

    override fun toString() = "Account for ${holder}, balance = ${balance} (overdraft = ${overdraft})"

}
