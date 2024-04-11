package homework_nr_9;

public interface Animal {

    default void quantyPaws(){
        int p=4;
        System.out.println("Number of paws is : " + p);
    }

    static void feedAnimal(){
        System.out.println("Animal is eating!");
    }
    void makeSound();
    void zoneOfHabitat();
}

