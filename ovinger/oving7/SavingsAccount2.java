package oving7;

public class SavingsAccount2 extends AbstractAccount {

  private int withdrawals;
  private double fee;

  public SavingsAccount2(int withdrawals, double fee) {
    super(0);
    if (withdrawals > 0 && fee >= 0) {
      this.withdrawals = withdrawals;
      this.fee = fee;
    }
  }

  @Override
  public void internalWithdraw(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("no neg numbers.");
    } else if ((super.accountBalance - amount - this.fee < 0)) {
      throw new IllegalStateException("ur broke");
    } else {
      super.accountBalance -= amount;
      if (this.withdrawals == 0) {
        super.accountBalance -= this.fee;
      } else {
        this.withdrawals--;
      }
    }
  }
}
