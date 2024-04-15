package homework_nr_10;

public class Employee {

    String Name;
    String Surname;
    int age;
    String departament;

    public Employee(String name, String surname, int age, String departament) {
        Name = name;
        Surname = surname;
        this.age = age;
        this.departament = departament;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", age=" + age +
                ", departament='" + departament + '\'' +
                '}';
    }
}


