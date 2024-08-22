package oving6.TheOffice;

public class testing {

  public static void main(String[] args) {
    Printer printer1 = new Printer("penisPrinter");
    Employee david = new Clerk(printer1);

    System.out.println(david.getResourceCount());
    // david.printDocument("hello i am david");
    // System.out.println(printer1.getPrintHistory(david));
    printer1.printDocument("cock and balls", david);
  }
}
