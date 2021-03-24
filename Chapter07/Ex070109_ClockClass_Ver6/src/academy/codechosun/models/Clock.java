package academy.codechosun.models;

public class Clock {
    private int seconds;

    public Clock() {}

    public byte getHours() {
        int hours = this.seconds / 60 / 60;

        return hours == 0 ? 12 : (byte)hours;

    }

    public byte getMinutes() {
        return (byte)(this.seconds / 60 % 60);
    }

    public byte getSeconds() {
        return (byte)(this.seconds % 60);
    }

    public void addSecondes(int seconds) {
        final int HALF_DAY_IN_SECONDS = 60 * 60 * 12;
        int val = this.seconds + seconds;

        while (val < 0) {
            val += HALF_DAY_IN_SECONDS;
        }

        this.seconds = val % HALF_DAY_IN_SECONDS;

    }

}




