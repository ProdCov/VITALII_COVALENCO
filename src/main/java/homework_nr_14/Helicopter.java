package homework_nr_14;

public class Helicopter extends Vehicle implements Flyable {
    
    public Helicopter(String manufacture, String model) {
        super(manufacture, model);
    }
    
    @Override
    public String toString() {
        return "Helicopter{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

