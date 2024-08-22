package oving4.Partner;

import java.rmi.StubNotFoundException;

public class Partner {

  private final String name;
  private Partner partner = null;

  public Partner(String name) {
    this.name = name;
  }

  public void setPartner(Partner partner) {
    if (this.partner == partner) {
      return;
    }
    if (this.partner == null) {
      this.partner = partner;
      // partner.setPartner(this);
    }
  }

  public void divorce() {
    if (this.partner == null) {
      return;
    }
    // this.partner.setPartner(null);
    this.setPartner(null);
  }

  public Partner getPartner() {
    return this.partner;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return "Name: " + this.name + " , Partner: " + this.partner.getName();
  }

  public static void main(String[] args) {
    Partner David = new Partner("David");
    Partner Ellie = new Partner("Ellie");
    David.setPartner(Ellie);
    // System.out.println(David.toString());
    // System.out.println(Ellie.toString());
    Partner Alex = new Partner("Alex");
    Ellie.divorce();
    System.out.println(David.toString());
  }
}
