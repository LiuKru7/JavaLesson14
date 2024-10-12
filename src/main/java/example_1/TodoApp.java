package example_1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TodoApp {
    Task[] tasks;
    Scanner scanner = new Scanner(System.in);

    public TodoApp() {
        tasks = new Task[20];
    }

    public void addTask() {

        System.out.println("Add task name: ");
        String taskName = scanner.nextLine();
        System.out.println("Add task description: ");
        String taskDescription = scanner.nextLine();
        System.out.println("Add task assignee: ");
        String assignee = scanner.nextLine();

        System.out.println("Add a priority (High - 1, Medium - 2, Low - 3 )");


        int taskPriority = -1;
        boolean isPriorityInValid = true;
        while (isPriorityInValid) {
            taskPriority = scanner.nextInt();
            scanner.nextLine();
            if (taskPriority < 1 || taskPriority > 3) {
                System.out.println("Invalid priority");
            } else {
                System.out.println("Priority is valid");
                isPriorityInValid = false;
            }
        }
        Task task = new Task(taskName,taskDescription,taskPriority,assignee);

        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = task;
                System.out.println("Task added: " + task.taskName + ".");
                return;
            }
        }
        System.out.println("No empty slots in array");
    }

    public void removeTask() {
        System.out.println("Remove task name: ");
        String taskName = scanner.nextLine();
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].taskName.equalsIgnoreCase(taskName)) {
                tasks[i] = null;
                System.out.println("Task is removed :" + taskName);
                return;
            }
        }
        System.out.println("Invalid task");
    }

    public void markTaskAsCompleted() {
        System.out.println("Completed task name: ");
        String taskName = scanner.nextLine();
        for (Task task : tasks) {
            if (task.taskName.equalsIgnoreCase(taskName)) {
                task.markCompleted();
                System.out.printf("%s marked completed %n", task.taskName);
                return;
            }
        }
        System.out.println("Task name does not exist.");
    }

    public void viewAllTasks() {
        System.out.println("Tasks (Tasks priority 1 - high; 2 - medium; 3 - low):");
        for (Task task : tasks) {
            if (task != null ) {
                System.out.printf("Task name: %s ; task description: %s; task priority %d; is completed %b. %n", task.taskName, task.description, task.priority,task.isCompleted);
            }
        }
    }


    public void viewPendingTasks() {
        System.out.println("Tasks (Tasks priority 1 - high; 2 - medium; 3 - low):");
        for (Task task : tasks) {
            if (task != null && !task.isCompleted) {
                System.out.printf("Task name: %s ; task description: %s; task priority %d . %n", task.taskName, task.description, task.priority);
            }
        }
    }

    public void viewCompletedTasks() {
        System.out.println("Tasks (Tasks priority 1 - high; 2 - medium; 3 - low):");
        for (Task task : tasks) {
            if (task != null && task.isCompleted) {
                System.out.printf("Task name: %s ; task description: %s; task priority %d . %n",
                        task.taskName, task.description, task.priority);
            }
        }
    }

    public int getTaskCount(){
        int count = 0;
        for (Task task : tasks) {
            if (task != null) {
                count++;
            }
        }
        return count;
    }
    public int getCompletedTaskCount(){
        int count = 0;
        for (Task task : tasks) {
            if (task != null && task.isCompleted) {
                count++;
            }
        }
        return count;
    }
    public void local() {
        System.out.println(LocalDateTime.now());


    }


}
