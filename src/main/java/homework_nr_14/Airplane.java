package homework_nr_14;

public class Airplane extends Vehicle implements Flyable {
    public Airplane(String manufacture, String model) {
        super(manufacture, model);
    }
    
    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
    
}
