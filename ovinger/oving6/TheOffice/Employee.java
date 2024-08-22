package oving6.TheOffice;

import java.util.function.BinaryOperator;

public interface Employee {
  // trenger ikke å declare public
  double doCalculations(
    BinaryOperator<Double> operation,
    double value1,
    double value2
  );
  void printDocument(String document);
  int getTaskCount();
  int getResourceCount();
}
