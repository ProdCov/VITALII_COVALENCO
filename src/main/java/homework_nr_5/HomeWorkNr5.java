package homework_nr_5;
// The task did not include the option to create psvm
public class HomeWorkNr5 {
    public static void main(String[] args) {

        int sum = 0;
        long multi = 1;

        int[] numbers = new int[100]; //Создайте массив типа int с именем numbers и количество элементов 100
        int[] copyNumbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 - i;
            copyNumbers[i] = numbers[i]; //Clone allay numbers
            if (numbers[i] % 2 == 0) {
                sum += numbers[i]; // Sum of even numbers
            }
            if (numbers[i] % 2 == 1) {
                multi *= numbers[i]; //Product of odd numbers

            }
            System.out.println(numbers[i]);
        }
        System.out.println(sum);
        System.out.println(multi);


        System.out.println("----------------");
        int sum2 = 0;
        long multi2 = 1;
        int[] numbers2 = new int[101]; //Заполните его числами от 100 до 0
        int[] copyNumbers2 = new int[101];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = 100 - i;
            copyNumbers2[i] = numbers2[i]; //Clone allay numbers
            if (numbers2[i] % 2 == 0) {
                sum2 += numbers2[i]; // Sum of even numbers
            }
            if (numbers2[i] % 2 == 1) {
                multi2 *= numbers2[i]; //Product of odd numbers

            }
            System.out.println(numbers2[i]);
        }
        System.out.println(sum2);
        System.out.println(multi2);

    }
}