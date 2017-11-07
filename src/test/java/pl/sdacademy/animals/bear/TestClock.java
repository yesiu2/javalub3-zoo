package pl.sdacademy.animals.bear;

import org.joda.time.DateTime;
import pl.sdacademy.clock.Clock;

public class TestClock implements Clock {

    @Override
    public DateTime getCurrentTime() {
        return DateTime.now().plusDays(11);
    }

    public DateTime getHibernateTime() {
        return DateTime.now().withMonthOfYear(1);
    }
}
