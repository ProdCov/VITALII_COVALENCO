package homework_nr_14;

import java.io.Serializable;

public class Vehicle implements Serializable {
private String manufacturer;
private String model;
    
    public Vehicle(String manufacture, String model) {
        this.manufacturer = manufacture;
        this.model = model;
    }
    
}
