package task_1;
public class ComputerMain {
    public static void main(String[] args) {
        Computer lenovo = new Computer("Lenovo");
        lenovo.setNotebook(false);
        lenovo.setCpuSpeed(3);
        lenovo.setOperatingSystem("Windows");
        lenovo.setRamSize(8);
        lenovo.setStorageCapacity(125);

        Computer asus = new Computer
                ("Asus", "Linux", 8, 256, 3.2, true  );
        Computer macBook = new Computer(8, 256, 2.456, true,"MacBook air m1");
        macBook.setOperatingSystem("Mac Os");

        System.out.println(asus.toString());
        System.out.println(lenovo.toString());
        System.out.println(macBook.toString());

    }


}
