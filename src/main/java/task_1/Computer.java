package task_1;

public class Computer {

    private String name;
    private String operatingSystem;
    private int ramSize;
    private double storageCapacity;
    private double cpuSpeed;
    private boolean isNotebook;

    public Computer(String name) {
        this.name = name;
    }

    public Computer(int ramSize, double storageCapacity, double cpuSpeed, boolean isNotebook, String name) {
        this.ramSize = ramSize;
        this.storageCapacity = storageCapacity;
        this.cpuSpeed = cpuSpeed;
        this.isNotebook = isNotebook;
        this.name = name;
    }

    public Computer(String name, String operatingSystem, int ramSize, double storageCapacity, double cpuSpeed, boolean isNotebook) {
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.ramSize = ramSize;
        this.storageCapacity = storageCapacity;
        this.cpuSpeed = cpuSpeed;
        this.isNotebook = isNotebook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public boolean isNotebook() {
        return isNotebook;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", ramSize=" + ramSize +
                ", storageCapacity=" + storageCapacity +
                ", cpuSpeed=" + cpuSpeed +
                ", isNotebook=" + isNotebook +
                '}';
    }
}

