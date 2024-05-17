package homework_nr_18;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public String task;
    protected List<TaskManager> taskList = new ArrayList<>();
    
    public TaskManager(String task) {
        if (task != "" & task != null) this.task = task;
    }
    
    public TaskManager() {
    
    }
    
    public void addTask(String task) {
        synchronized (task) {
            if (task != "" & task != null)
                taskList.add(new TaskManager(task));
        }
    }
    
    public void removeTask(String task) {   //!!!?????????
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        synchronized (task) {
            System.out.println(Thread.currentThread().getName() + " I'm deleting task!");
            taskList.remove(task);
        }
    }
    
    public void getTaskCount() {
        synchronized (taskList) {
            System.out.println("Size of task list is: " + taskList.size());
        }
    }
    
    public void getAllTasks() {
        synchronized (taskList) {
            for (TaskManager element :
                    taskList) {
                System.out.println(element.toString());
            }
        }
    }
    
    @Override
    public String toString() {
        return "TaskManager{" +
                "task='" + task + '\'' +
                '}';
    }
}
