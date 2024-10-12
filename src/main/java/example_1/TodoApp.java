package example_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    public void metodas () {
        String firstTask = "";
        double number = 0;

        for (int i = 0; i < tasks.length ; i++) {
            if (tasks[i] != null) {
                double newNumber = dateFormat(tasks[i].dateCompleted);
                if (number == 0) {
                    number = newNumber;
                    firstTask = tasks[i].taskName;
                }

                if (number < newNumber) {
                    number = newNumber;
                    firstTask = tasks[i].taskName;
                }
            }
        }
        System.out.println("First task name  : " + firstTask );
    }

    public void menu () {
        boolean isOn = true;


        while (isOn) {
            System.out.println("Please choose an option:");
            System.out.println("1. Add a new task.");
            System.out.println("2. Remove a task.");
            System.out.println("3. Mark a task as completed.");
            System.out.println("4. View all tasks.");
            System.out.println("5. View completed tasks.");
            System.out.println("6. View pending tasks.");
            System.out.println("7. Show total number of tasks.");
            System.out.println("8. Show total number of completed tasks.");
            System.out.println("9. Perform a custom action.");
            System.out.println("0. Exit the program.");


            String value = scanner.nextLine();


            switch (value){
                case "1" -> addTask();
                case "2" -> removeTask();
                case "3" -> markTaskAsCompleted();
                case "4" -> viewAllTasks();
                case "5" -> viewCompletedTasks();
                case "6" -> viewPendingTasks();
                case "7" -> System.out.println("Tasks: " + getTaskCount());
                case "8" -> System.out.println("Completed tasks :" + getCompletedTaskCount());
                case "9" -> metodas();
                case "0" -> isOn = false;
            }
        }
    }
    public double dateFormat (LocalDateTime date) {
        LocalDateTime currentDateTime = date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        double formattedDateTime = Double.parseDouble(currentDateTime.format(formatter));
        return formattedDateTime;
    }
}

