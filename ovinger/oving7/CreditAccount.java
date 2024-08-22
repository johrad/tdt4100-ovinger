package oving7;

public class CreditAccount extends AbstractAccount {

  private double creditLine;

  public double getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(double creditLine) {
    if (creditLine < 0) {
      throw new IllegalArgumentException("Credit less than zero");
    } else if (
      !(super.accountBalance + creditLine >= 0) && super.accountBalance < 0
    ) {
      throw new IllegalStateException(
        "super.accountBalance + creditLine >= 0) && super.accountBalance < 0"
      );
    } else {
      this.creditLine = creditLine;
    }
  }

  public CreditAccount(double creditLine) {
    super(0);
    if (creditLine < 0) {
      throw new IllegalArgumentException("Credit less than zero");
    } else {
      this.creditLine = creditLine;
    }
  }

  @Override
  public void internalWithdraw(double amount) {
    if (
      (amount > 0) && (super.accountBalance - amount >= -1 * this.creditLine)
    ) {
      super.accountBalance -= amount;
    } else {
      throw new IllegalStateException("Trying to withdraw too much");
    }
  }
}
