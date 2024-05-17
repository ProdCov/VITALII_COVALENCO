package homework_nr_18;

public class Main {
    public static void main(String[] args) {
        TaskManager mondaysTasks = new TaskManager();
        Thread t1 = new Thread(() -> mondaysTasks.addTask("Get up!"));
        Thread t2 = new Thread(() -> mondaysTasks.addTask("Take a breakfast!"));
        Thread t3 = new Thread(() -> mondaysTasks.addTask("Go to work."));
        Thread t4 = new Thread(() -> mondaysTasks.addTask("WORKING!"));
        Thread t5 = new Thread(() -> mondaysTasks.addTask("Take a lunch!"));
        Thread t6 = new Thread(() -> mondaysTasks.addTask("Go to sleep!"));
        Thread t7 = new Thread(() -> mondaysTasks.addTask("Go home."));
        Thread t8 = new Thread(() -> mondaysTasks.removeTask("WORKING!"));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
         try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Thread t9 = new Thread(mondaysTasks::getAllTasks);
        Thread t10 = new Thread(mondaysTasks::getTaskCount);
        t9.start();
        t9.setPriority(Thread.MIN_PRIORITY);
        t10.start();
        
        
    }
}
