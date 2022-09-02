/**
 * Класс реализующий хранение данных списка задач.
 */
package scheduler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Scheduler <Task> implements UploadToFile {

    /**Поле список задач*/
    private List<Task> taskList = new ArrayList<Task>();

    /**
     * Конструктор - создание экземпляра класса.
     */
    public Scheduler() {

    }

    /**
     * Метод получения значения поля {@link Scheduler#taskList}
     * @return списко задач.
     */
    public List<Task> getTaskList() {
        return taskList;
    }

    /**
     * Метод получения строчного вида списка задач.
     * @return
     */
    @Override
    public String toString() {
        return "Scheduler{" +
                "taskList=" + taskList +
                '}';
    }

    /**
     * Метод добавления новой задачи в список задач.
     * @param task добавляемая задача.
     */
    public void addTask(Task task){
        taskList.add(task);
    }

    /**
     * Метод записи списка задач в файл .csv
     * @throws IOException
     */
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

