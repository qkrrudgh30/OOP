package academy.codechosun.models;

public class SevenSegmentDisplay {
    public enum Segment {
        A,
        B,
        C,
        D,
        E,
        F,
        G
    }

    private boolean[] data = new boolean[7];

    public SevenSegmentDisplay(byte digit) {
        switch(digit) {
            case 0:
                // setting segment
                break;
        }
    }

    public void set(Segment segment, boolean on) {
        // setting segement
    }

    public void get() {
        // reading segement on/off
    }

}



