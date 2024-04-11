package homework_nr_9;

public class Main {

    public static void main(String[] args) {

        Animal jumbo = new Elephant();
        Erbivor bambo = new Elephant();
        jumbo.quantyPaws();
        jumbo.zoneOfHabitat();
        jumbo.makeSound();
        Animal.feedAnimal();
        System.out.println("----------------");
        bambo.erbivorEating();
        bambo.favoriteFood();

    }
}
