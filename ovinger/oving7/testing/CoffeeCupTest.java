package oving7.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import oving7.PassengerCar;

public class CoffeeCupTest {

  CoffeeCup c = new CoffeeCup(10, 5);

  @Test
  @DisplayName("Check capcity")
  public void capcityCheck() {
    Assertions.assertEquals(10, c.getCapacity(), "Check capacity");
  }

  //   @Test
  //   @DisplayName("")
  //   public void func() {
  //       Assertions.assertEquals();
  //   }

  @Test
  @DisplayName("Test drink and refill")
  public void drinking() {
    c.drinkCoffee(5);
    Assertions.assertEquals(
      10 - 5 - 5,
      c.getCurrentVolume(),
      "Check drink vol"
    );

    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        c.fillCoffee(11);
      },
      "check fill"
    );

    c.fillCoffee(10);
    this.capcityCheck();
  }
}
// koden er good.
