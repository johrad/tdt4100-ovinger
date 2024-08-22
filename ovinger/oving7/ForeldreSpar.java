package oving7;

public class ForeldreSpar extends SavingsAccount {

  private int withdrawals;
  private final int maxWithdrawals;

  public ForeldreSpar(double ir, int withdrawals) {
    super(ir);
    if (withdrawals > 0) {
      this.maxWithdrawals = withdrawals;
      this.withdrawals = withdrawals;
    } else {
      throw new IllegalArgumentException("Cant have neg. withdrawals");
    }
  }

  @Override
  public void endYearUpdate() {
    super.endYearUpdate();
    this.withdrawals = this.maxWithdrawals;
  }

  @Override
  public void withdraw(double amount) {
    if (this.withdrawals > 0) {
      super.withdraw(amount);
      this.withdrawals--;
    } else {
      throw new IllegalStateException("You are out of withdrawals");
    }
  }

  public int getRemainingWithdrawals() {
    return this.withdrawals;
  }
}
