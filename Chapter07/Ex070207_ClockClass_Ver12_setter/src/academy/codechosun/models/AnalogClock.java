package academy.codechosun.models;

public class AnalogClock extends Clock {
    public void addSecondes(int seconds) {
        int val = this.seconds + seconds;
        while (val < 0) {
            val += DAY_IN_SECONDS;
        }

        this.seconds = val % DAY_IN_SECONDS;

    }

    public short getSecondHandAngle() {
        return (short)(getSeconds() * 6);
    }

    public short getMinuteHandAngle() {
        return (short)(getMinutes() * 6);
    }

    public short getHourHandAngle() {
        final int ANGLE_PER_HOUR = 360 / 12;

        int hours = getHours() % 12;
        return (short)(hours * ANGLE_PER_HOUR + getMinutes() * ANGLE_PER_HOUR / 60);
    }

}