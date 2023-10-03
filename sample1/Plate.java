package geekbrains.lesson1.sample1;

public class Plate {
    private int food;







    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if(food < 0) {
            this.food = 0;
        }
        else {
            this.food = food;
        }
    }

    public Plate(int food) {
        if(food < 0) {
            this.food = 0;
        }
        else {
            this.food = food;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood(int food){
        this.food += food;
    }
}
