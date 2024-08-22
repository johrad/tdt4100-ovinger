package oving7;

public class DebitAccount extends AbstractAccount {

  public DebitAccount() {
    super(0);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void internalWithdraw(double amount) {
    if (super.accountBalance - amount >= 0) {
      super.accountBalance -= amount;
    } else {
      throw new IllegalStateException("Cannot comply, balance too low.");
    }
  }
}
