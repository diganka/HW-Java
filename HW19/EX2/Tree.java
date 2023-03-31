package HW19.EX2;

public class Tree {
    public String type;
    public int height;
    public int coutOfsticks;
    public String colour;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCoutOfsticks() {
        return coutOfsticks;
    }

    public void setCoutOfsticks(int coutOfsticks) {
        this.coutOfsticks = coutOfsticks;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Tree(String type, int height){
        this.type = type;
        this.height = height;
        this.coutOfsticks = 13;
        this.colour = "Зеленый";
    }
    public Tree(int height, int coutOfsticks, String colour){
        this.type = "пихта";
        this.height = height;
        this.coutOfsticks = coutOfsticks;
        this.colour = colour;
    }
    public Tree(){
        this.height = 350;
        this.coutOfsticks = 29;
        this.colour = "Желтый";
    }
    public Tree(String type){
        this();
        this.type = type;
    }
    public void getInfo() {
        System.out.println(getType());
        System.out.println(getHeight());
        System.out.println(getCoutOfsticks());
        System.out.println(getColour());
    }
}

