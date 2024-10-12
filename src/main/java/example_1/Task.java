package example_1;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    String taskName;
    String description;
    int priority;
    boolean isCompleted;
    String assignee;
    LocalDateTime dateCreated;
    LocalDateTime dateCompleted;


    public Task(String taskName, String description, int priority, String asignee) {
        this.taskName = taskName;
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
        this.assignee = asignee;
        dateCreated = LocalDateTime.now();
    }

    public void markCompleted() {
        dateCompleted = LocalDateTime.now();
        isCompleted = true;
    }

    public String getPriorityAssString() {
        if (priority == 1) {
            return "High";
        } else if (priority == 2) {
            return "Medium";
        } else if (priority == 3) {
            return "Low";
        } else {
            System.out.println("Invalid priority");
            return "";
        }
    }
}





