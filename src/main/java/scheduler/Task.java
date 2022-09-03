/**
 * Клосс реализующий сущность "Задача".
 */
package scheduler;



import java.util.Date;
import java.util.UUID;

public class Task {

    /**Поле id*/
    private final String id;

    /**Поле отметка времени*/
    private String timeStamp;

    /**Поле срок выполнения*/
    private String deadLine;

    /**Поле приоритет*/
    private Priority priority;


    /**
     * Конструктор - создание задачи с указанием параметров.
     * @param id id
     * @param timeStamp отметка времени
     * @param deadLine срок выполнения
     * @param priority приоритет
     */
    public Task(String id, String timeStamp, String deadLine, Priority priority) {
        this.timeStamp = new Date().toString();
        this.deadLine = deadLine;
        this.priority = priority;
        this.id = UUID.randomUUID().toString();
    }

    /**
     * Конструктор - создание задачи без указания параметров.
     */
    public Task() {
        this.timeStamp = new Date().toString();
        id = UUID.randomUUID().toString();
    }

    /**
     * Метод получения значения поля {@link Task#id}
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Метод получения значения поля {@link Task#timeStamp}
     * @return отметка времени
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Метод получения значения поля {@link Task#deadLine}
     * @return срок выполнения
     */
    public String getDeadLine() {
        return deadLine;
    }

    /**
     * Метод задания значения поля {@link Task#deadLine}
     * @param deadLine срок выполнения
     */
    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    /**
     * Метод получения значения поля {@link Task#priority}
     * @return приоритет
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Метод задания значения поля {@link Task#priority}
     * @param priority
     */
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    /**
     * Метод получения строчного вида задачи.
     * @return
     */
    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", deadLine='" + deadLine + '\'' +
                ", priority=" + priority +
                '}';
    }
}

