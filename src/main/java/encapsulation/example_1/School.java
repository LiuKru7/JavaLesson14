package encapsulation.example_1;

public class School {
    public static void main(String[] args) {
        Student john = new Student(13, "Utena", "Liu", true );
        System.out.println(john.getName());
        john.setName("Paulius");
        System.out.println(john.getName());


    }
}
