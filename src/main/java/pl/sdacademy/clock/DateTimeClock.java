package pl.sdacademy.clock;

import org.joda.time.DateTime;

public class DateTimeClock implements Clock {

    @Override
    public DateTime getCurrentTime() {
        return DateTime.now();
    }
}
