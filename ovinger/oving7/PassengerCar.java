package oving7;

public class PassengerCar extends TrainCar {

  private int passengerCount;

  public int getPassengerCount() {
    return this.passengerCount;
  }

  public void setPassengerCount(int passengerCount) {
    if (passengerCount >= 0) {
      this.passengerCount = passengerCount;
    }
  }

  public PassengerCar(int dryMass, int passengerCount) {
    super(dryMass);
    if (passengerCount >= 0) {
      this.passengerCount = passengerCount;
    } else {
      throw new IllegalArgumentException("sth went wrong bro");
    }
  }

  @Override
  public int getTotalWeight() {
    return (this.passengerCount * 80) + super.getDeadWeight();
  }
}
