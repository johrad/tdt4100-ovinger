package oving7;

public abstract class AbstractAccount {

  protected double accountBalance;

  public AbstractAccount(double accountBalance) {
    if (accountBalance >= 0) {
      this.accountBalance = accountBalance;
    } else {
      throw new IllegalArgumentException("no debt");
    }
  }

  public void deposit(double amount) {
    if (amount > 0) {
      this.accountBalance += amount;
    } else {
      throw new IllegalArgumentException("error, amount <0");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0) {
      internalWithdraw(amount);
    } else {
      throw new IllegalArgumentException("amount < 0");
    }
  }

  public abstract void internalWithdraw(double amount);

  public double getBalance() {
    return this.accountBalance;
  }
}
