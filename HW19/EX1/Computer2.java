package HW19.EX1;

public class Computer2 {
    private String name;
    private int cost;
    private int memory;
    private int GPU;
    Computer AppleMacBook = new Computer("Apple MacBook", 31900, 256, 10);

    public Computer2() {
        this.name = name;
        this.cost = cost;
        this.memory = memory;
        this.GPU = GPU;
    }

    public void getInfo() {
        System.out.println(getName());
        System.out.println(getCost());
        System.out.println(getMemory());
        System.out.println(getGPU());

    }

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

    public void setGPU(int GPU) {
        this.GPU = GPU;
    }
}