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

    public void tick() {
        addSecondes((short) 1);
    }

    public void mount() {
        System.out.println("Mounting the clock on the wall.");
    }

}




