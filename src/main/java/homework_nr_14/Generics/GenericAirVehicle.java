package homework_nr_14.Generics;


import homework_nr_14.Flyable;
import homework_nr_14.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GenericAirVehicle<T extends Vehicle & Flyable> {
    private final List<T> listOfFlyableVehicles = new ArrayList<>();
    
    public void addNewVehicle(T inputVehicle) {
        
        listOfFlyableVehicles.add(inputVehicle);
    }
    
    @Override
    public String toString() {
        return "List of flyable vehicles=" + listOfFlyableVehicles;
    }
}
