package student_grades_manager;

public class GradesManagerMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", new int[]{85, 90, 78, 92}),
                new Student("Bob", new int[]{60, 70, 80, 65}),
                new Student("Charlie", new int[]{50, 45, 55, 60}),
                new Student("Edvinas", new int[]{85, 90, 111, 92, 100}),
        };

        for (Student student : students) {
            System.out.println(student);

        }
    }

}
