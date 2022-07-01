public class Car {

    // Make your cars variable private to make sure it doesn't get access outside the Garage class
    private int year, wheels, mpg;
    private String make, model;

    public Car(int year, String make, String model, int wheels, int mpg) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.wheels = wheels;
        this.mpg = mpg;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
        System.out.println("year is set to " + year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
        System.out.println("Make is set to " + make);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("Model is set to " + model);
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
        System.out.println("Wheel is set to " + wheels);
    }

    public int getMPG() {
        return this.mpg;
    }

    public void setMPG(int mpg) {
        this.mpg = mpg;
        System.out.println("MPG is set to " + make);
    }

    @Override
    public String toString() {
        return "[make: " + this.make + " | model: " + this.model + " | year: " + this.year + " | number of wheels: "
                + this.wheels + " | MPG: " + this.mpg + "]";
    }

}
