package homework_nr_7;

public class Programmer extends Employee {
    String programingLanguage;
    int yearOfExperience;
    
    public Programmer(String name, String surname, String programingLanguage, int yearOfExperience) {
        super(name, surname);
        this.programingLanguage = programingLanguage;
        this.yearOfExperience = yearOfExperience;
    }
    
    @Override
    public void work() {
        System.out.println("Don't disturb, programmer " + name + " is working!");
    }
}
