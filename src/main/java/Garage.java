
// You will need get, set and add methods in your Garage class for your cars
// These methods must be public
import java.util.*;

public class Garage {

    private List<Car> garage;

    public Garage() {
        garage = new LinkedList<Car>();
    }

    public Car getCarFromGarage(int idx) {
        return garage.get(idx);
    }

    public void addCarToGarage(Car car) {
        garage.add(car);
    }

    public void switchCarInGarage(int idx, Car car) {
        garage.set(idx, car);
    }

    public Car removeCarFromGarage(int idx) {
        return garage.remove(idx);
    }

    public void removeAllCarsFromGarage() {
        garage.clear();
    }

    public boolean isEmpty() {
        return garage.isEmpty();
    }

    public void getAllCars() {
        int counter = 1;
        for (Car c : garage) {
            System.out.println(counter + ": " + c + ", ");
            counter++;
        }
    }

}
