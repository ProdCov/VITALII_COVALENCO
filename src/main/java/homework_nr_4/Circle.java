package homework_nr_4;

import java.util.Scanner;

public class Circle {
    float radius;
    
    public Circle(float radius) {
        this.radius = radius;
    }
    
    static void calculateArea(float x) {
        double areaCircle = Math.PI * Math.pow(x, 2);
        System.out.println("Area of a circle is :" + areaCircle + " cm^2");
    }
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Would like to calculate a area of a circle ? Y/N ");
        String answerUser = userInput.next();
        switch (answerUser) {
            case "y":
                Scanner userInputRadius = new Scanner(System.in);
                System.out.print("Input radius of a circle :");
                Circle circle1 = new Circle(userInputRadius.nextFloat());
                System.out.println("If circle radius is " + circle1.radius);
                calculateArea(circle1.radius);
                break;
            case "n":
                break;
        }
        
    }
    
}
