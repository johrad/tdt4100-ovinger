package oving1.Account;

public class Account {
  private double balance;
  private double interestRate;

  // Creating constructor:
  public Account() {
    this.balance = 0.0;
    this.interestRate = 0.0;
  }
  
  // Creating set methods:

  public void deposit(double toDeposit) {
    if (toDeposit > 0.0) {
      this.balance += toDeposit;
    }
  }
  
  public void addInterest(double IR) {
    this.balance += this.balance * IR;
  }

  public void setInterestRate(double IR) {
    this.interestRate = IR;
  }

  // creating get methods:
  public double getBalance() {
    return this.balance;
  }

  // Creating toString():
  public String toString() {
    return "Account Balance: " + this.balance;
  }


  public static void main(String[] args) {
    Account newAccount = new Account();
    newAccount.deposit(20.0);
    // double account_balance = newAccount.balance;
    System.out.println(newAccount.toString());
  }
};


