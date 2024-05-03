package homework_nr_15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("Buggati", 2023);
        Car car2 = new Car("Toyota", 1995);
        Car car3 = new Car("Porsche", 2019);
        Car car4 = new Car("VW", 1945);
        Car car5 = new Car("KIA", 1994);
        Car car6 = new Car("Honda", 2008);
        Set<Car> carHashSet = new HashSet<>(Arrays.asList(car1, car2, car3, car4, car5, car6));
        Set<Car> carTreeSet = new TreeSet<>(Arrays.asList(car1, car2, car3, car4, car5, car6));
        
        carHashSet.stream()
                .sorted((o1, o2) -> {
                    return Comparator.comparing((Car e) -> e.yearMade)
                            .reversed()
                            .compare(o1, o2);
                })
                .forEach(e -> System.out.println(e.toString()));
        
        System.out.println("-------------------------");
        carTreeSet.stream()
                .sorted(CarSort.SORT_BY_NAME.getComparator())
                .forEach(e -> System.out.println(e.toString()));
    }
    
}
        
        

