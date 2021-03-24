package academy.codechosun.models;

public class Clock {
    private byte hours = 12;
    private byte minutes;
    private byte seconds;

    public Clock() {}

    public byte getHours() {
        return this.hours;
    }

    public void setHours(byte hours) {
        int val = hours - 1;

        while (val < 0) {
            val += 12;
        }

        this.hours = (byte)(val % 12 + 1);

    }

    public byte getMinutes() {
        return this.minutes;
    }

    public void setMinutes(byte minutes) {
        while (minutes < 0) {
            minutes += 60;
        }

        this.minutes = (byte)(minutes % 60);

    }

    public byte getSeconds() {
        return this.seconds;
    }

    public void setSecondes(byte seconds) {
        while (seconds < 0) {
            seconds += 60;
        }

        this.seconds = (byte)(seconds % 60);

    }

    public void setTime(byte hours, byte minutes, byte seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSecondes(seconds);
    }

}




