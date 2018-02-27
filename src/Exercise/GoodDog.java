package Exercise;

public class GoodDog {
    public int getSize() {
        return size;
    }

    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public void bark(){
        if (size>60){
            System.out.println("Woof! Woof!");
        } else if (size>14){
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
