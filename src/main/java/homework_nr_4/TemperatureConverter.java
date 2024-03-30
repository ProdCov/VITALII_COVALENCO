package homework_nr_4;
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose type of degrees");
        System.out.print("Press F for Fahrenheit or C for Celsius :");
        String typeOfDegrees = userInput.next();
        System.out.print("Indicate value of degrees: ");
        float valueOfDegrees = userInput.nextFloat();
        switch (typeOfDegrees){
            case "f":
                toCelsius(valueOfDegrees);
                break;
            case "c":
                toFahrenheit(valueOfDegrees);
                break;
            case "":
                System.out.println("You don't choose the type of degrees.");
                break;
            default:
                System.out.println("The wrong type of degrees.");

        }

    }
    static void toCelsius(float x){
    float fahrenheitDegrees = (x - 32) * 5 / 9 ;
        System.out.println("It is " + fahrenheitDegrees + " degrees in Fahrenheit!");
    }

    static void toFahrenheit(float x){
    float celsiusDegrees = (x * 9 / 5) + 32;
        System.out.println("It is " + celsiusDegrees + " degrees in Celsius!");

    }
}
