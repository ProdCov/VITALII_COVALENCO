package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {
        int x = 7;
        switch (x) {
            case 1:
                System.out.println("January");
            break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("In our universe there is no such month");
    }
        System.out.println("--------------");
    for(int y = 100; y<=1000; y+=5) {
            System.out.println(y);
    }

        System.out.println("--------------");
        double z = 1;
        double y = 3;
        double total = 0D;

        while(y<=97){
            total +=z/y;
            z=y;
            y+=2;
        }
        System.out.println("Method 1 :" + total);
        System.out.println("--------------");
        double sum = 0D;
        for (double c=1,v=3; v<=97; v+=2){
            sum+=c/v;
            c=v;
        }
        System.out.println("Method 2 :" + sum);

    }

}

