package homework_nr_13;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.print("Print first number: ");
        Scanner userInput = new Scanner(System.in);
        int firstNumber = userInput.nextInt();
        System.out.print("Print second number: ");
        Scanner userInput2 = new Scanner(System.in);
        int secondNumber = userInput2.nextInt();
        try {
            countDivisibleBy7Numbers(firstNumber, secondNumber);
        } catch (InvalidRangeException e) {
            throw new RuntimeException("Invalid input second number is greater than first!");
        }
    }
    
    public static void countDivisibleBy7Numbers(int x, int y) throws InvalidRangeException {
        int iterations = 0;
        if (x > y)
            throw new InvalidRangeException();
        for (int i = x; i < y; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                iterations++;
            }
        }
        System.out.println("In this range of numbers are " + iterations + " numbers that are divisible by 7!");
    }
}
