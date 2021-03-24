package academy.codechosun.models;

public class Clock {
    private byte hours = 12;
    private byte minutes;
    private byte seconds;

    public Clock() {}

    public byte getHours() {
        return this.hours;
    }

    public byte getMinutes() {
        return this.minutes;
    }

    public byte getSeconds() {
        return this.seconds;
    }

    public void addSecondes(short seconds) {
        final int HALF_DAY_IN_SECONDS = 60 * 60 * 12;
        int val = this.seconds + seconds;

        while (val < 0) {
            val += HALF_DAY_IN_SECONDS;
        }

        this.seconds = (byte)(val % 60);

        val = val / 60;
        val += this.minutes;
        this.minutes = (byte)(val % 60);

        val = val / 60;
        val += this.hours - 1;
        this.hours = (byte)(val % 12 + 1);

    }

}




