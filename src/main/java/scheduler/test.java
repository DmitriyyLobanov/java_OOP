package scheduler;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        Task newTask = new Task();
        newTask.setPriority(Priority.LOW);
        newTask.setDeadLine("Zavtra!!!");
        Task second = new Task();
        Task three = new Task();

        Scheduler<Task> sche = new Scheduler<>();
        sche.addTask(newTask);
        sche.addTask(second);
        sche.addTask(three);


        System.out.println(newTask);
        System.out.println(second);
        System.out.println(three);

        sche.uploadToCSV();


    }
}
