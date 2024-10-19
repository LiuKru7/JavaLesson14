package employers_manager;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public double calculateSalary(){
        return getBaseSalary() + (bonus/12);
    }
}
//2. Paveldėtos klasės:
//
//        •	Klasė FullTimeEmployee:
//        •	Paveldi iš Employee.
//	•	Papildoma savybė:
//        •	bonus (double): metinis priedas už gerus rezultatus.
//	•	Metodas calculateSalary(): apskaičiuoja mėnesinį atlyginimą kaip baseSalary + (bonus / 12).