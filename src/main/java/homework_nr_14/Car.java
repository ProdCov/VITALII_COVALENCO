package homework_nr_14;

public class Car extends Vehicle {
    public Car(String manufacture, String model) {
        super(manufacture, model);
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
