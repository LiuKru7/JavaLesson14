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

    public  void addTaskAuto(Task task) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = task;
                System.out.println("Task added: " + task.taskName + ".");
                return;
            }
        }
        System.out.println("No empty slots in array");
    }

    public void addTask() {
        System.out.println("ADD NEW TASK");
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
        System.out.println("Invalid task name.");
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
        System.out.println("All tasks: ");


        int index = 0;
        for (Task task : tasks) {
            if (task != null ) {
                index++;
                String priorityTask = task.getPriorityAssString(task.priority);
                String completed = task.isCompleted ? "completed" : "not completed";
                System.out.printf("%d.Name: %s ; Description: %s; Priority %s; %s %n",index, task.taskName, task.description, priorityTask ,completed);
            }
        }
    }

    public void viewPendingTasks() {
        System.out.println("Pending tasks: ");
        int index = 0;
        for (Task task : tasks) {
            if (task != null && !task.isCompleted) {
                index++;
                String priorityTask = task.getPriorityAssString(task.priority);
                System.out.printf("%d. Name: %s ; Description: %s; Priority %s . %n",index, task.taskName, task.description, priorityTask);
            }
        }
    }

    public void viewCompletedTasks() {
        System.out.println("Completed tasks:");
        int index = 0;
        for (Task task : tasks) {
            if (task != null && task.isCompleted) {
                index++;
                String priorityTask = task.getPriorityAssString(task.priority);
                System.out.printf("%d.Name: %s ; Description: %s; Priority %s . %n",
                        index,task.taskName, task.description, priorityTask);
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

    public void firstCompletedTask () {
        String firstTask = "";
        double number = 0;

        for (Task task : tasks) {
            if (task != null && task.isCompleted) {
                double newNumber = dateFormat(task.dateCompleted);
                if (number == 0) {
                    number = newNumber;
                    firstTask = task.taskName;
                }

                if (number > newNumber) {
                    number = newNumber;
                    firstTask = task.taskName;
                }
            }
        }
        if (firstTask.equalsIgnoreCase("")) {
            System.out.println("No task is completed");
            return;
        }
        System.out.println("First task completed  : " + firstTask );
    }

    public void changeAssignee () {
        System.out.println("Change task assignee:");
        System.out.println("Add task name: ");
        String taskName = scanner.nextLine();
        System.out.println("Enter the new assignee name: ");
        String  assignee = scanner.nextLine();

        for (Task task : tasks) {
            if (task.taskName.equalsIgnoreCase(taskName)) {
                task.assignee = assignee;
                return;
            }
        }

    }

    public void menu () {
        boolean isOn = true;


        while (isOn) {
            System.out.println("************************");
            System.out.println("Please choose an option:");
            System.out.println("************************");
            System.out.println("1. Add a new task.");
            System.out.println("2. Remove a task.");
            System.out.println("3. Mark a task as completed.");
            System.out.println("4. View all tasks.");
            System.out.println("5. View completed tasks.");
            System.out.println("6. View pending tasks.");
            System.out.println("7. Show total number of tasks.");
            System.out.println("8. Show total number of completed tasks.");
            System.out.println("9. Show first task completed.");
            System.out.println("10. Change assignee");
            System.out.println("0. Exit the program.");

            String value = scanner.nextLine();

            switch (value){
                case "1" -> addTask();
                case "2" -> removeTask();
                case "3" -> markTaskAsCompleted();
                case "4" -> viewAllTasks();
                case "5" -> viewCompletedTasks();
                case "6" -> viewPendingTasks();
                case "7" -> System.out.println("Tasks count: " + getTaskCount());
                case "8" -> System.out.println("Completed tasks count :" + getCompletedTaskCount());
                case "9" -> firstCompletedTask();
                case "10" -> changeAssignee();
                case "0" -> isOn = false;
                default -> System.out.println("Invalid value");
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

