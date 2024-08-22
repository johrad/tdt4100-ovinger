package oving7;

public class TrainCar {

  private int dryWeight;

  public TrainCar(int dryWeight) {
    if (dryWeight > 0) {
      this.dryWeight = dryWeight;
    } else {
      throw new IllegalArgumentException("Cant have sub-zero mass");
    }
  }

  public int getTotalWeight() {
    return this.dryWeight;
  }

  public void setDeadWeight(int dryWeight) {
    if (dryWeight > 0) {
      this.dryWeight = dryWeight;
    } else {
      throw new IllegalArgumentException("Cant have sub-zero mass");
    }
  }

  public int getDeadWeight() {
    return this.dryWeight;
  }
}
