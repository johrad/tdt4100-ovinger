package oving6.TheOffice;

import java.util.function.BinaryOperator;

public class Clerk implements Employee {

  private final Printer printer;
  private int taskCount; // default value = 0

  public Clerk(Printer printer) {
    this.printer = printer;
  }

  @Override
  public double doCalculations(
    BinaryOperator<Double> operation,
    double value1,
    double value2
  ) {
    this.taskCount++;
    return 60.4; // implement this
  }

  @Override
  public void printDocument(String document) {
    if (this.printer != null) {
      this.printer.printDocument(document, this);
      this.taskCount++;
    } else {
      throw new IllegalArgumentException("Brother, u fucked the print");
    }
  }

  @Override
  public int getTaskCount() {
    return this.taskCount;
  }

  @Override
  public int getResourceCount() {
    return 1;
  }
}
