package homework_nr_9;

public class Elephant extends Erbivor implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets!");

    }

    @Override
    public void zoneOfHabitat() {
        System.out.println("Habitat zone of elephant is tropical forests, savannas, grasslands, and woodlands.");
    }

    @Override
    public void favoriteFood() {
        System.out.println("Elephant's favorite food is jackfruit");
    }


}
