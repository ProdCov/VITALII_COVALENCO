package homework_nr_10;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        List<Integer> listOfNumbers = List.of(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> filterOddNumbers = e-> {

            return e%2==1;
        };
       testOddNumbers(listOfNumbers, filterOddNumbers);

       System.out.println("------------------");

        Function<Integer,Integer> multiplyNumbers = e -> {

            return e*2;
        };
        multiplyNumbers(listOfNumbers, multiplyNumbers);
        System.out.println("------------------");//First method
        listOfNumbers.forEach(e-> System.out.println(e*2));//Second method

        System.out.println("------------------");

        Consumer<String> greeting = e-> System.out.println("Hello "+e+" !!!");
        greeting.accept("Bob");

        System.out.println("------------------");


        Employee employee1 = new Employee("Bob","Marley",79,"Software Engineering");
        Employee employee2 = new Employee("John", "Wick", 50, "QA");
        Employee employee3 = new Employee("Alex", "Popa", 19, "QA");
        Employee employee4 = new Employee("Boris", "Baranov", 18, "Software Engineering");
        List<Employee> employeeList = List.of(employee1,employee2,employee3,employee4);

        List<String> listOfEmployee = employeeList.stream()
                .map(e-> e.getName())
                .toList();

        Supplier<String> randomName = () -> {
            int value = (int) (Math.random()*listOfEmployee.size());
            return listOfEmployee.get(value);
        };

        System.out.println(randomName.get());
        System.out.println("------------------");


                Predicate<Employee> position = e -> e.departament.equals("Software Engineering");
        testEmployee(employeeList, position);
        System.out.println("----------------------");

        Predicate<Employee> age = e -> e.age >20;
        testEmployee(employeeList, age);
        System.out.println("----------------------");

        Predicate<Employee> nameStartsWithA = e -> e.Name.startsWith("A");
        testEmployee(employeeList, nameStartsWithA);
        System.out.println("----------------------");

    }
     public static void testOddNumbers (List<Integer> inputList, Predicate<Integer> algo){

        for (int i = 0; i != inputList.size(); i++) {
             if (inputList.get(i)%2 ==1 ){
                 System.out.println(inputList.get(i));
             }
         }

     }
     public static void multiplyNumbers (List<Integer> inputList, Function<Integer,Integer> algo){
        int multiply;
         for (int i = 0; i != inputList.size(); i++) {
             multiply=inputList.get(i)*2;
             System.out.println(multiply);
         }

     }
     public static void testEmployee(List<Employee> e, Predicate<Employee> testMethod){

         for (int i = 0; i != e.size() ; i++) {
             if(testMethod.test(e.get(i))){
                 Employee b = e.get(i);
                 System.out.println(b);
             }

         }
     }

}
