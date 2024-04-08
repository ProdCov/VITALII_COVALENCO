package homework_nr_7;

public abstract class Person {

    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printMyName(){

        System.out.println("My name is " + name + '.');
    }

}
