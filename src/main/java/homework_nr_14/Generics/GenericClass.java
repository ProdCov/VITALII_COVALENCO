package homework_nr_14.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T extends Number>{

private List<T> listOfNumbers = new ArrayList<>();
    
    public GenericClass(List<T> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }
    
    @Override
    public String toString() {
        return "Generic{" +
                "listOfNumbers=" + listOfNumbers +
                '}';
    }
}
