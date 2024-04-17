package homework_nr_7;

public class Manager extends Employee {
    public int teamSize;
    public String teamName;
    
    public Manager(String name, String surname, int teamSize, String teamName) {
        super(name, surname);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }
    
    @Override
    public void work() {
        System.out.println("Manager " + name + " in search of clients.");
    }
}
