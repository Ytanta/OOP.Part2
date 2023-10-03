package geekbrains.lesson1.sample1;

import geekbrains.lesson1.Product;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik", 15),
                new Cat("Thomas", 600),
                new Cat("Vlad", 20),
                new Cat("Sashka", 20),
                new Cat("Mister Puzik", 5)
        };

        Plate plate = new Plate(650);
        plate.info();
        plate.addFood(50);
        plate.info();
        for (Cat cat : cats) {
            if (plate.getFood() - cat.getAppetite() >= 0) {
                cat.eat();
                plate.setFood(plate.getFood() - cat.getAppetite());
            }
            cat.info();
            }
        }
    }
