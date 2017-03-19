package pl.sdacademy.animals.bear;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import pl.sdacademy.animals.Animal;


public abstract class Bear implements Animal {

    //Set very old date to make sure Bear is not alive upon creation
    private DateTime lastMealDate = new DateTime().withYear(1410);

    @Override
    public boolean isAlive() {
        return new Duration(lastMealDate, DateTime.now()).isShorterThan(Duration.standardDays(10));
    }

    public void eat() {
        lastMealDate = DateTime.now();
    }

    @Override
    public int getWeight() {
        return 0;
    }

}
