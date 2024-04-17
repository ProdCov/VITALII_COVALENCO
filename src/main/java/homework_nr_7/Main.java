package homework_nr_7;

public class Main {
    
    public static void main(String[] args) {
        
        Manager manager1 = new Manager("Vasile", "Cretu", 6, "Sales department");
        Manager manager2 = new Manager("Marat", "Башаров", 5, "Purchasing department");
        Programmer javaDeveloper = new Programmer("Mark", "Burkovsky", "Java", 29);
        Programmer pythonQA = new Programmer("Elena", "Darii", "Python", 33);
        manager2.printMyName();
        pythonQA.printMyName();
        manager1.work();
        javaDeveloper.work();
        System.out.println("----------------");
        Person[] employeeList = new Person[]{
                manager1, javaDeveloper, manager2, pythonQA
            
        };
        for (int index = 0; index != employeeList.length; index++) {
            if (employeeList[index] instanceof Manager tempObject) {
                tempObject.work();
            }
        }
    }
}
