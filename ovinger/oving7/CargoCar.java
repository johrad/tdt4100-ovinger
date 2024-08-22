package oving7;

public class CargoCar extends TrainCar {

  private int cargoWeight;

  public CargoCar(int dryWeight, int cargoWeight) {
    super(dryWeight);
    if (cargoWeight >= 0) {
      this.cargoWeight = cargoWeight;
    } else {
      throw new IllegalArgumentException("no man");
    }
  }

  public int getCargoWeight() {
    return cargoWeight;
  }

  public void setCargoWeight(int cargoWeight) {
    if (cargoWeight >= 0) {
      this.cargoWeight = cargoWeight;
    } else {
      throw new IllegalArgumentException("no man");
    }
  }

  @Override
  public int getTotalWeight() {
    return super.getDeadWeight() + this.cargoWeight;
  }

  public int getPassengerCount() {
    return 0;
  }
}
