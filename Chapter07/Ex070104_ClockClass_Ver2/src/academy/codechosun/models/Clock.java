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
        this.hours = (byte)Math.min(Math.max(1, hours), 12);
    }

    public byte getMinutes() {
        return this.minutes;
    }

    public void setMinutes(byte minutes) {
        this.minutes = (byte)Math.min(Math.max(0, minutes), 59);
    }

    public byte getSeconds() {
        return this.seconds;
    }

    public void setSecondes(byte seconds) {
        this.seconds = (byte)Math.min(Math.max(0, seconds), 59);
    }

    public void setTime(byte hours, byte minutes, byte seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSecondes(seconds);
    }

}




