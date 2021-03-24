package academy.codechosun.models;

public class Clock {
    protected int seconds;

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

    public void tick() {
        final int HALF_DAY_IN_SECONDS = 60 * 60 * 12;
        this.seconds = (this.seconds + 1) % HALF_DAY_IN_SECONDS;
    }

    public void mount() {
        System.out.println("Mounting the clock on the wall.");
    }

}




