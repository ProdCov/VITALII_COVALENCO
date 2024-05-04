package homework_nr_16;

import java.io.*;
import java.util.ArrayList;

public class Main {
    private static final File inputFile = new File("src/main/java/homework_nr_16/input.txt");
    private static final File outputFile = new File("src/main/java/homework_nr_16/output.txt");
    private static final ArrayList<String[]> dataArray = new ArrayList<>();
    
    public static void main(String[] args) {
        listOfClass(inputFile);
        if (!dataArray.isEmpty()) {
            writeData(findAverageMark(dataArray));
            writeData(findYoungestPerson(dataArray));
            writeData(findOldestPerson(dataArray));
        }
    }
    
    public static void listOfClass(File inputFile) {
        String line;
        BufferedReader listOfClass;
        try {
            listOfClass = new BufferedReader(new FileReader(inputFile));
            while ((line = listOfClass.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 3) {
                    dataArray.add(values);
                } else {
                    System.out.println("Incorrect value: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void writeData(String string) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile, true))) {
            bufferedWriter.write(string);
            bufferedWriter.append("\n");
        } catch (IOException e) {
            System.out.println("Error writing data!");
        }
    }
    
    private static String findAverageMark(ArrayList<String[]> dataArray) {
        int i = 0;
        double sumAllMark = 0;
        
        for (String[] person : dataArray) {
            double mark = Double.parseDouble(person[2]);
            sumAllMark += mark;
            i++;
        }
        double averageMark = sumAllMark / i;
        return "Средний балл: " + averageMark;
    }
    
    private static String findYoungestPerson(ArrayList<String[]> dataArray) {
        int youngestAge = Integer.MAX_VALUE;
        String youngestName = "";
        for (String[] person : dataArray) {
            int age = Integer.parseInt(person[1]);
            if (age < youngestAge) {
                youngestAge = age;
                youngestName = person[0];
            }
        }
        return "Самый младший человек: " + youngestName + " (возраст " + youngestAge + ")";
    }
    
    private static String findOldestPerson(ArrayList<String[]> dataArray) {
        int oldestAge = Integer.MIN_VALUE;
        String oldestName = "";
        for (String[] person : dataArray) {
            int age = Integer.parseInt(person[1]);
            if (age > oldestAge) {
                oldestAge = age;
                oldestName = person[0];
            }
        }
        return "Самый старший человек: " + oldestName + " (возраст: " + oldestAge + ")";
    }
    
}
