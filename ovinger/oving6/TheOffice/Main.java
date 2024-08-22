package oving6.TheOffice;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

  public static void main(String[] args) {
    Printer hpPrinter = new Printer("HP");

    Employee grunt1 = new Clerk(hpPrinter);
    Employee grunt2 = new Clerk(hpPrinter);
    Employee grunt3 = new Clerk(hpPrinter);

    Collection<Employee> clerkCollection = new ArrayList<>();
    clerkCollection.add(grunt1);
    clerkCollection.add(grunt2);
    clerkCollection.add(grunt3);

    Manager Lars = new Manager(clerkCollection);
    Lars.printDocument("hello1");
    Lars.printDocument("hello1");
    Lars.printDocument("hello1");
    Lars.printDocument("hello1");

    double eff =
      Double.valueOf(Lars.getTaskCount()) /
      Double.valueOf(Lars.getResourceCount()); // Rar måte å definere efficency på
    System.out.println("Efficency at 1 manager: " + eff);

    Collection<Employee> middleManagers1 = new ArrayList<>();
    middleManagers1.add(Lars);
    Manager Odd = new Manager(middleManagers1);

    Collection<Employee> middleManagers2 = new ArrayList<>();
    middleManagers2.add(Lars);
    middleManagers1.add(Odd);
    Manager Ola = new Manager(middleManagers2);

    Ola.printDocument("Hello");
    Ola.printDocument("Hello");
    Ola.printDocument("Hello");
    Ola.printDocument("Hello");

    eff =
      Double.valueOf(Ola.getTaskCount()) /
      Double.valueOf(Ola.getResourceCount());

    System.out.println("Efficency at 2 managers: " + eff);
    System.out.println(hpPrinter.getPrintHistory(grunt1));
  }
}
