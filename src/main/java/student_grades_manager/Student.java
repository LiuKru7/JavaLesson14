package student_grades_manager;
import java.util.Arrays;

public class Student {
    private final String name;
    private int [] grades ;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = Arrays.copyOf(grades, grades.length);
        setGrades(this.grades);
    }

    private void setGrades(int[] grades) {
        for (int i = 0; i < grades.length ; i++) {
            if (grades[i] > 100 ) {
                grades[i] = 100;
            }
            if (grades[i] < 1) {
                grades[i] = 1;
            }
        }
        this.grades = grades;
    }


    private double calculateAverage(){
        int gradesSum = 0;
        for (int grade : grades) {
            gradesSum += grade;
        }
        return (double) gradesSum/grades.length;
        }

    private String getPerformanceCategory(){
        if (calculateAverage()>89) {
            return "Excellent";
        } else if (calculateAverage()>=75) {
            return "Good";
        } else {
            return "Needs Improvement";
        }
    }

    @Override
    public String toString() {
        return "Student name: " + this.name + "\n" +
                "Grades: " + Arrays.toString(this.grades)  + "\n" +
                "Average: " + calculateAverage() + "\n" +
                "Performance: " + getPerformanceCategory() + "\n" +
                "-------------------------";
    }

}


