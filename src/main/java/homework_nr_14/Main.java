package homework_nr_14;

import homework_nr_14.Generics.GenericAirVehicle;
import homework_nr_14.Generics.GenericClass;
import java.util.Arrays;

public class Main {
    
    
    public static void main(String[] args) {
        GenericClass<Integer> integerList = new GenericClass<>(Arrays.asList(1, 3, 4, 7, 11, 18, 29, 47, 78, 125));
        GenericClass<Float> floatList = new GenericClass<>(Arrays.asList(7846.5321f, 7986.4516f, 78461.2168f, 21685.412f));
        System.out.println(floatList);
        System.out.println(integerList);
        System.out.println("-------------------------");
        
        Airplane airplane1 = new Airplane("Beechcraft", "Baron G58");
        Airplane airplane2 = new Airplane("Falcon", "2000");
        Helicopter heli1 = new Helicopter("Mi", "17");
        Helicopter heli2 = new Helicopter("PZL", "SM-2");
        
        GenericAirVehicle<Airplane> myAirplaneGarage = new GenericAirVehicle<>();
        GenericAirVehicle<Helicopter> myHelicopterGarage = new GenericAirVehicle<>();
        myAirplaneGarage.addNewVehicle(airplane1);
        myAirplaneGarage.addNewVehicle(airplane2);
        System.out.println(myAirplaneGarage);
        myHelicopterGarage.addNewVehicle(heli1);
        myHelicopterGarage.addNewVehicle(heli2);
        System.out.println(myHelicopterGarage);
        
        
    }
}
