package scheduler;



import java.util.Date;
import java.util.UUID;

public class Task {
    private final String id;

    private String timeStamp;

    private String deadLine;
    private Priority priority;



    public Task(String id, String timeStamp, String deadLine, Priority priority) {
        this.timeStamp = new Date().toString();
        this.deadLine = deadLine;
        this.priority = priority;
        this.id = UUID.randomUUID().toString();
    }

    public Task() {
        this.timeStamp = new Date().toString();
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

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

