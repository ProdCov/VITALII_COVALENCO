package homework_nr_11;

import java.util.*;

public class HomeWorkNr11 {

    public static void main(String[] args) {


        List<String> stringList = List.of("Apple","Pineapple","Cherry","Apricot","Pear","Strawberry","Mango","Banana","Kiwi","Peach");
        List<String> fruits = stringList.stream()
                .map(e->e.toLowerCase(Locale.ROOT))
                .filter(e->e.contains("a"))
                .filter(e->e.length()<5)
               .toList();
        System.out.println(fruits);
        System.out.println("------------------");
        List<Person> ourTeam = new ArrayList<>(Arrays.asList(
                new Person("Ion", "Popa", 20, true),
                new Person("Ivan", "Ivanov", 25, true),
                new Person("Maria", "Petrov", 28, false),
                new Person("Irina", "Cojocaru", 50, false),
                new Person("Vsevolod", "Cretu", 34, true),
                new Person("Mark", "Toyotav", 54, true),
                new Person("Liudmila", "Mitu", 36, false),
                new Person("Mia", "Mironova", 25, false),
                new Person("Vlad", "Pusnei", 29, true),
                new Person("Elizaveta", "Negura", 23, false)
        ));
        List<String> filterTeam = ourTeam.stream()
                .filter(e->e.age<30)
                .filter(e->e.isMale)
                .map(e->e.name)
                .toList();
        System.out.println(filterTeam);

        System.out.println("------------------");

        Optional<Person> firstElemenInList = ourTeam.stream()
                .filter(e-> !e.isMale)
                .filter(e->e.age<30)
                .filter(e->e.getSurname().toLowerCase(Locale.ROOT).contains("p"))
                .findFirst();
        System.out.println(firstElemenInList.orElse(new Person("Error!","Error!",-1,false)));


    }
}
