package encapsulation.example_1;

public class Student {

    private String name;
    private String address;
    private int age;
    private boolean isExamPassed;


    public Student(int age, String address, String name, boolean isExamPassed) {
        this.age = age;
        this.address = address;
        this.name = name;
        this.isExamPassed = isExamPassed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        if (name.length() < 2) {
            System.out.println("Name can not be only 1 char long.");
            return;
        }
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isExamPassed() {
        return isExamPassed;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
