package no.inmeta.oo

class BankAccount(val balance: Double) {
  def deposit(amount: Double): BankAccount = {
    new BankAccount(balance + amount)
  }
  def withdraw(amount: Double): BankAccount = {
    new BankAccount(balance - amount)
  }
}
