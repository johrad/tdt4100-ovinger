package oving7;

import java.util.ArrayList;
import java.util.Collection;

public class Train {

  private Collection<TrainCar> trainCars = new ArrayList<>();

  public Train() {}

  public Train(Collection<TrainCar> trainCars) {
    if (!trainCars.isEmpty()) {
      this.trainCars = trainCars;
    } else {
      throw new IllegalArgumentException("Collection is empty");
    }
  }

  public void addTrainCar(TrainCar car) {
    this.trainCars.add(car);
  }

  public boolean contains(TrainCar car) {
    return this.trainCars.contains(car);
  }

  public int getTotalWeight() {
    return this.trainCars.stream().mapToInt(TrainCar::getTotalWeight).sum();
  }

  public int getPassengerCount() {
    return trainCars
      .stream()
      .filter(tc -> tc instanceof PassengerCar)
      .mapToInt(tc -> ((PassengerCar) tc).getPassengerCount())
      .sum();
  }

  public int getCargoWeight() {
    return trainCars
      .stream()
      .filter(tc -> tc instanceof CargoCar)
      .mapToInt(tc -> ((CargoCar) tc).getCargoWeight())
      .sum();
  }

  public String toString() {
    return "Hey man, add the toString!"; // fix this
  }
}
