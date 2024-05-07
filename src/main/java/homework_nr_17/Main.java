package homework_nr_17;

public class Main {
    private synchronized static void englishAlphabet() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
    
    private static void englishAlphabetWithDelay() {
        for (char i = 'a'; i <= 'z'; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("The " + Thread.currentThread().getName()+ " was interrupted " );
            }
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
    
    public static void main(String[] args) {
        Runnable runnable1 = Main::englishAlphabet;
        Runnable runnable2 = Main::englishAlphabetWithDelay;
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable1);
        Thread t3 = new Thread(runnable2);
        Thread t4 = new Thread(runnable2);
        t1.start();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted " + e);
        }                       //For orderliness in output
        System.out.println("-----------------------");
        t3.start();
        t4.start();
        t3.interrupt();
    }
}
