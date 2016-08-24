package no.inmeta.oo

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

class BankAccountTest extends FeatureSpec with GivenWhenThen with Matchers{
  info("Test demo for silly Account class")

  feature("A bank account handling deposits"){
    scenario("Withdraw money from account") {
      Given("A bank account with 500")
      val account = new BankAccount(500)

      When("Withdraw 200")
      val accountWithrawn = account.withdraw(200)

      Then("Balance should be 300")
      accountWithrawn.balance should be(300)
    }

    scenario("Deposit money to an account") {
      Given("A bank account with 300")
      val account = new BankAccount(300)

      When("Depositing 200 to account")
      val accountDeposited = account.deposit(200)

      Then("Balance should be 500")
      accountDeposited.balance should be(500)
    }
  }
}
