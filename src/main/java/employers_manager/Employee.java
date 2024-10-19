package employers_manager;

public class Employee {
    private String name;
    private int id;
    private double baseSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary;

    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
//Savybės:
//        •	name (String): darbuotojo vardas.
//        •	id (int): unikalus darbuotojo ID.
//	•	baseSalary (double): bazinis atlyginimas.
//        •	Metodai:
//        •	getters ir setters visoms savybėms.
//	•	calculateSalary(): abstraktus metodas, kurį reikės įgyvendinti paveldėtose klasėse.
//        •	toString(): metodas, kuris grąžina darbuotojo informaciją (vardas, ID, atlyginimas).
