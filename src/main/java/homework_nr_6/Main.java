package homework_nr_6;

public class Main {

    public static void main(String[] args) {
        Invoice wholeBuyer = new Invoice("Toaster", "Cooks bread", 3, 22.20);
        wholeBuyer.getAmount();

        System.out.println("--------------");
        Date dataClass = new Date(0,0,0);
        dataClass.setYear(2023); // Check for invalid date
        dataClass.setMonth(2);
        dataClass.setDay(29);
        dataClass.displayDate();
        dataClass.setYear(2024);
        dataClass.setMonth(2);
        dataClass.setDay(29);
        dataClass.displayDate();

    }
}
