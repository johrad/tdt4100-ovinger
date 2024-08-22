package oving7;

public class BSU extends SavingsAccount {

  private double depositedYr;
  private double maxAdd;

  public BSU(double ir, double maxAdd) {
    super(ir);
    if (maxAdd > 0) {
      this.maxAdd = maxAdd;
    } else {
      throw new IllegalArgumentException("nuh uh, <0");
    }
  }

  @Override
  public void deposit(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("test123");
    }
    if (this.depositedYr + amount < this.maxAdd) {
      super.deposit(amount);
      this.depositedYr += amount;
    } else {
      throw new IllegalStateException("too much123");
    }
  }

  @Override
  public void withdraw(double amount) {
    if (amount > this.depositedYr) {
      throw new IllegalStateException("Trying to withdraw too much.");
    } else {
      super.withdraw(amount);
    }
  }

  public double getTaxDeduction() {
    return this.depositedYr * 0.20;
  }

  @Override
  public void endYearUpdate() {
    super.endYearUpdate();
    this.depositedYr = 0;
  }

  public static void main(String[] args) {
    BSU bsu1 = new BSU(0.14, 20000);
    bsu1.deposit(400);
    bsu1.withdraw(440);

    System.out.println(bsu1.getBalance());
  }
}
