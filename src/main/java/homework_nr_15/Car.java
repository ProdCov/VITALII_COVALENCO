package homework_nr_15;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    String name;
    
    int yearMade;
    
    public Car(String name, int yearMade) {
        this.name = name;
        this.yearMade = yearMade;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearMade=" + yearMade +
                '}';
    }
    
    @Override
    public int compareTo(Car o) {
        return Comparator.comparing((Car e) -> e.name)
                .thenComparing((Car e) -> e.yearMade)
                .compare(this, o);
    }
    
}
