package pl.sdacademy.animals.bear;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.jupiter.api.Test;
import pl.sdacademy.clock.Clock;

import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void bearShouldBeAliveIfHasEatenWithin10Days() {
        Bear bear = new BlackBear(1);
        bear.eat(5);

        boolean result = bear.isAlive();

        assertTrue(result == true);
    }

    @Test
    void feedingBearShouldSetTheDateOfTheLastMealForNow() {
        Bear bear = new BlackBear(1);
        bear.eat(5);

        DateTime result = bear.getLastMealTime();

        assertTrue(new Duration(result, DateTime.now()).isShorterThan(Duration.standardSeconds(1)));
    }

    @Test
    void bearShouldNotBeAliveIfItHasNotEatenForMoreThan10Days() {
        Bear bear = new BlackBear(2, new TestClock());

        assertFalse(bear.isAlive());
    }

    @Test
    void bearShouldIncreaseWeightAsMuchAsItEaten() {
        Bear bear = new BlackBear(2);

        bear.eat(5);

        double result = bear.getWeight();

        assertTrue(result == 7);
    }

    @Test
    void bearShouldIncrease75PercentWaterWeightAfterDrink() {
        Bear bear = new PolarBear(1);

        bear.drinkWater(1);

        double result = bear.getWeight();

        assertTrue(result == 1.75);
    }
}