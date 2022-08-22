package scheduler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Scheduler <Task> implements UploadToFile {
    private List<Task> taskList = new ArrayList<Task>();

    public Scheduler() {

    }

    public List<Task> getTaskList() {
        return taskList;
    }

    @Override
    public String toString() {
        return "Scheduler{" +
                "taskList=" + taskList +
                '}';
    }

    public void addTask(Task task){
        taskList.add(task);
    }


    @Override
    public void uploadToCSV() throws IOException {
        try {
            Files.createFile(Path.of("src\\main\\java\\scheduler\\Scheduler.csv"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter writer = new FileWriter("src\\main\\java\\scheduler\\Scheduler.csv"))
        {
            for (Task task: taskList) {
                writer.write(task.toString());
                writer.write("\n");
            }
        }
    }
}

