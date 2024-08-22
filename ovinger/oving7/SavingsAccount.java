package oving7;

public class SavingsAccount implements Account {

  private double accountBalance;
  private double ir;

  public SavingsAccount(double ir) {
    this.ir = ir;
  }

  @Override
  public void deposit(double amount) {
    if (amount > 0.0) {
      this.accountBalance += amount;
    } else {
      throw new IllegalArgumentException("error");
    }
  }

  @Override
  public void withdraw(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("no neg numbers.");
    } else if ((this.accountBalance - amount < 0)) {
      throw new IllegalStateException("ur broke");
    } else {
      this.accountBalance -= amount;
    }
  }

  @Override
  public double getBalance() {
    return this.accountBalance;
  }

  public void endYearUpdate() {
    this.accountBalance = this.accountBalance * (1 + this.ir);
  }
}
