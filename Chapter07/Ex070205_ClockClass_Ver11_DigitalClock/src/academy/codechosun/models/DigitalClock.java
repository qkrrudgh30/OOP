package academy.codechosun.models;

public class DigitalClock extends Clock {
    public DigitalClock() {}

    public boolean isBeforeMidday() {
        return (super.seconds / (DAY_IN_SECONDS / 2) == 0);
    }

}

