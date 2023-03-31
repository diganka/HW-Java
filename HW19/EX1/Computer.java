package HW19.EX1;

public class Computer {
    private String name;
    private int cost;
    private int memory;
    private int GPU;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getGPU() {
        return GPU;
    }

    public void GPU(int GPU) {
        this.GPU = GPU;
    }

    public Computer(String name, int cost, int memory, int GPU) {
        System.out.println("Создан РС:");
        System.out.println("Имя = " + name);
        System.out.println("Цена = " + cost);
        System.out.println("Видеокарта = " + GPU);
        System.out.println("ОЗУ = "+ memory);
    }
    public void getInfo() {
        System.out.println(getName());
        System.out.println(getCost());
        System.out.println(getMemory());
        System.out.println(getGPU());
    }
}

