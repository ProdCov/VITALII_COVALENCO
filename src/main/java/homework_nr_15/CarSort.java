package homework_nr_15;

import java.util.Comparator;

public enum CarSort {
    
    SORT_BY_NAME(Comparator.comparing((Car e) -> e.name)),
    SORT_BY_PRODUCTION_YEAR(Comparator.comparing((Car e) -> e.yearMade));
    
    
    private final Comparator<Car> comparator;
    
    CarSort(Comparator<Car> comparator) {
        this.comparator = comparator;
    }
    
    public Comparator<Car> getComparator() {
        return comparator;
    }
    
    
}
