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
        this.hours = hours;
    }

    public byte getMinutes() {
        return this.minutes;
    }

    public void setMinutes(byte minutes) {
        this.minutes = minutes;
    }

    public byte getSeconds() {
        return this.seconds;
    }

    public void setSecondes(byte seconds) {
        this.seconds = seconds;
    }

    public void setTime(byte hours, byte minutes, byte seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSecondes(seconds);
    }

}




