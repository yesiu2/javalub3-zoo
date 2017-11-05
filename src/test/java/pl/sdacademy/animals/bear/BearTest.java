package pl.sdacademy.animals.bear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void bearShouldBeAliveIfEatenWithin10Days() {
        Bear bear = new BlackBear(1);

        boolean result = bear.isAlive();

        assertTrue(result == true);
    }
}