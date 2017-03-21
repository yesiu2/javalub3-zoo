package pl.sdacademy.animals.bear;

import pl.sdacademy.animals.Animal;


public abstract class Bear implements Animal {

    private int weight;

    public Bear(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    public void eat() { }

    @Override
    public int getWeight() {
        return weight;
    }

}
