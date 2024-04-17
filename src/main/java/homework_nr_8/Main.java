package homework_nr_8;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("Wake up!");
        toDoList.add("Brush teeth");
        toDoList.add("Breakfast");
        toDoList.add("Go to work");
        toDoList.add("WORK");
        toDoList.add("Have a lunch");
        toDoList.add("WORK");
        toDoList.add("Have a dinner");
        toDoList.add("Go to bed");
        for (int i = 0; i != toDoList.size(); i++) {
            System.out.println(i + " " + toDoList.get(i));
        }
        System.out.println("---------------");
        PrintingUniqueArrayList(toDoList);
        System.out.println("---------------");
        Map<String, String> englishRomanianDictionary = new HashMap<>();
        englishRomanianDictionary.put("good", "bine");
        englishRomanianDictionary.put("house", "casa");
        englishRomanianDictionary.put("human", "om");
        englishRomanianDictionary.put("special", "special");
        englishRomanianDictionary.put("report", "raport");
        englishRomanianDictionary.put("cat", "pisica");
        englishRomanianDictionary.put("t-shirt", "maiou");
        englishRomanianDictionary.put("sun", "soare");
        englishRomanianDictionary.put("salt", "sare");
        englishRomanianDictionary.put("size", "marime");
        System.out.println(englishRomanianDictionary);
    }
    
    private static void PrintingUniqueArrayList(List<String> toDoList) {
        Set<String> uniqueArrayList = new HashSet<>(toDoList);
        System.out.println(uniqueArrayList);
        
    }
    
}
