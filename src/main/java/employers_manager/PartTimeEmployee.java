package employers_manager;

public class PartTimeEmployee {
    private int hoursWorked;
    private double hourlyRate;
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

}
//	•	Klasė PartTimeEmployee:
//        •	Paveldi iš Employee.
//	•	Papildoma savybė:
//        •	hoursWorked (int): darbo valandų kiekis per mėnesį.
//	•	hourlyRate (double): atlyginimas už valandą.
//	•	Metodas calculateSalary(): apskaičiuoja mėnesinį atlyginimą kaip hoursWorked * hourlyRate.
