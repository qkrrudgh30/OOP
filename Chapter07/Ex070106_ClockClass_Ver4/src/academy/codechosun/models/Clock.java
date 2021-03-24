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
        int wrapCount = 0;

        while (minutes < 0) {
            --wrapCount;
            minutes += 60;
        }

        wrapCount += minutes / 60;

        this.minutes = (byte)(minutes % 60);

        if (wrapCount != 0) {
            setHours((byte)(this.hours + wrapCount));
        }

    }

    public byte getSeconds() {
        return this.seconds;
    }

    public void setSecondes(byte seconds) {
        int wrapCount = 0;

        while (seconds < 0) {
            --wrapCount;
            seconds += 60;
        }

        wrapCount += seconds / 60;

        this.seconds += (byte)(seconds % 60);

        if (wrapCount != 0) {
            this.setMinutes((byte)(this.minutes + wrapCount));
        }

    }

    public void setTime(byte hours, byte minutes, byte seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSecondes(seconds);
    }

}




