package pl.sdacademy.animals.bear;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import pl.sdacademy.animals.Animal;


public abstract class Bear implements Animal {

    private int weight;
    private DateTime lastMealTime;

    public Bear(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean isAlive() {
        return new Duration(lastMealTime, DateTime.now()).isShorterThan(Duration.standardDays(10));
    }

    public void eat() {
        lastMealTime = DateTime.now();
    }

    @Override
    public int getWeight() {
        return weight;
    }

}
