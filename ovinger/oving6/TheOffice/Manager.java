package oving6.TheOffice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BinaryOperator;
import javax.print.event.PrintJobAttributeEvent;

public class Manager implements Employee {

  private Collection<Employee> employees;
  private int taskCount; // default value = 0

  public Manager(Collection<Employee> employees) {
    if (!employees.isEmpty()) {
      this.employees = employees;
    } else {
      throw new IllegalArgumentException("bro is King Nothing.");
    }
  }

  @Override
  public double doCalculations(
    BinaryOperator<Double> operation,
    double value1,
    double value2
  ) {
    this.taskCount++;
    return getAvailibleClerk().doCalculations(operation, value1, value2);
  }

  private Employee getAvailibleClerk() {
    // --  Implement sending work to another employee in here. -- //
    /* Im thinking that u can implement a sth like:
     * -> Go through collection of Clerks, save clerk with lowest taskCount to a variable.
     * -> Once loop has eneded, pick that clerk variable and let him do the task.
     *
     * ====> Or just pick a random one lol.
     */

    // Because I like lists.
    List<Employee> employeeList = new ArrayList<>(this.employees);
    Random random = new Random();
    int a = random.nextInt(employeeList.size());
    // System.out.println(a);
    return employeeList.get(a);
  }

  @Override
  public void printDocument(String document) {
    getAvailibleClerk().printDocument(document);
    this.taskCount++;
  }

  @Override
  public int getTaskCount() {
    return this.taskCount;
  }

  @Override
  public int getResourceCount() {
    return this.employees.size() + 1; // + 1 cuz of himself
  }
}
