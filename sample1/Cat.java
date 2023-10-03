package geekbrains.lesson1.sample1;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public boolean getSatiety() {
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat() {
        satiety = true;
    }
    public void info() {
        System.out.println("Cat:" + name +  " Appetite:"  + appetite + " Satiery:" + satiety);
    }
}
