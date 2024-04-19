package homework_nr_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        Months[] printingCalendarYear = Months.values();
        for (int i = 0; i != printingCalendarYear.length; i++) {
            
            System.out.println(printingCalendarYear[i]);
            
        }
        System.out.println("------------------------");
        FuelTypes[] printingFuelTypes = FuelTypes.values();
        for (int i = 0; i != printingFuelTypes.length; i++) {
            System.out.println("The " + printingFuelTypes[i] +
                    " is liquid : " + printingFuelTypes[i].isLiquidFuel);
            
        }
        System.out.println("------------------Checking of numbers");
        System.out.print("Print your number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        CheckInteger[] checking = CheckInteger.values();
        for (int i = 0; i != checking.length; i++) {
            checkAndPrint(number, checking[i]);
        }
        
        
    }
    
    public static void checkAndPrint(int x, CheckInteger algo) {
        
        System.out.println("The number was " + algo + " and result is :" + algo.algo.test(x));
        
    }
}
