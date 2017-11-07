package pl.sdacademy.animals.bear;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.jupiter.api.Test;

import pl.sdacademy.clock.Clock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void bearShouldBeAliveIfHasEatenWithin10Days() {
        Bear bear = new BlackBear(1);
        bear.eat(5);

        assertThat(bear.isAlive()).isTrue();
    }

    @Test
    void feedingBearShouldSetTheDateOfTheLastMealForNow() {
        Bear bear = new BlackBear(1);
        bear.eat(5);

        assertThat(new Duration(bear.getLastMealTime(), DateTime.now()).isShorterThan(Duration.standardSeconds(1)))
                .isTrue();
    }

    @Test
    void bearShouldNotBeAliveIfItHasNotEatenForMoreThan10Days() {
        Bear bear = new BlackBear(1, new TestClock());

        boolean result = bear.isAlive();

        assertThat(result).isFalse();
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

    @Test
    void bearsMassDecreaseAfterPooping() {
        Bear bear = new BlackBear(1);

        bear.poop();

        double result = bear.getWeight();

        assertThat(result).isEqualTo(0.95);
    }

    @Test
    void bearIsHibernatingBecauseItsWinter() {
        Bear bear = new BlackBear(1, new TestClock());


        boolean b = bear.isHibernating();

        assertThat(b).isTrue();
    }


}