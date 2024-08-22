package oving6.TheOffice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Printer {

  private final String printerID;
  private HashMap<Employee, List<String>> printerList = new HashMap<>();

  public Printer(String printerID) {
    this.printerID = printerID;
  }

  public void printDocument(String document, Employee employee) {
    if (!this.printerList.containsKey(employee)) { // Check if employee not in the list
      List<String> newList = new ArrayList<>(); // init list for the hashmap
      newList.add(document);
      this.printerList.put(employee, newList);
    } else {
      List<String> oldList = this.printerList.get(employee); // Gets old list
      oldList.add(document);
      this.printerList.put(employee, oldList); // Appends current doc to list
    }
  }

  public List<String> getPrintHistory(Employee employee) {
    if (this.printerList.containsKey(employee)) {
      return this.printerList.get(employee);
    } else {
      // throw new IllegalArgumentException("this dude has not printed anything");
      return null;
    }
  }
}
