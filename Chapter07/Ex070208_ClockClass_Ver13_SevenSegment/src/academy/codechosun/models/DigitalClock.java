package academy.codechosun.models;

public class DigitalClock extends Clock {
    public DigitalClock() {}

    public boolean isBeforeMidday() {
        return (super.seconds / (DAY_IN_SECONDS / 2) == 0);
    }

    public void setIsBeforeMidday(boolean isAm) {
        if (isAm && (DAY_IN_SECONDS / 2) < super.seconds ) {
            super.seconds -= (DAY_IN_SECONDS / 2);
        }

        if ((!isAm) && super.seconds < (DAY_IN_SECONDS / 2)) {
            super.seconds += (DAY_IN_SECONDS);
        }
        
    }

    public void setHours(byte hours) {
        int val = hours - 1;

        while (val < 0) {
            val += 12;
        }

        super.seconds += (int)((val % 12 + 1) * 60 * 60);

        if (super.seconds < (DAY_IN_SECONDS / 2)) {
            this.setIsBeforeMidday(true);
        } else {
            this.setIsBeforeMidday(false);
        }

    }

    public void setMinutes(byte minutes) {
        int wrapCount = 0;

        while (minutes < 0) {
            --wrapCount;
            minutes += 60;
        }

        wrapCount += minutes / 60;

        super.seconds += (int)((minutes % 60) * 60);

        if (wrapCount != 0) {
            super.seconds += (int)(wrapCount * 60 * 60);
        }
        
    }

    public void setSecondes(byte seconds) {
        int wrapCount = 0;

        while (seconds < 0) {
            --wrapCount;
            seconds += 60;
        }

        wrapCount += seconds / 60;

        super.seconds += (int)(seconds % 60);

        if (wrapCount != 0) {
            super.seconds += (int)(wrapCount * 60);
        }

    }

    public void setTime(boolean isAm, byte hours, byte minutes, byte seconds) {
        this.setIsBeforeMidday(isAm);
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSecondes(seconds);
    }

    public SevenSegmentDisplay[] getHoursDisplay() {
        return convertToTwoDigitDisplay(getHours());
    }

    public SevenSegmentDisplay[] getMinutesDisplay() {
        return convertToTwoDigitDisplay(getMinutes());
    }

    public SevenSegmentDisplay[] getSecondsDisplay() {
        return convertToTwoDigitDisplay(getSeconds());
    }

    private SevenSegmentDisplay[] convertToTwoDigitDisplay(byte number) {
        SevenSegmentDisplay[] displays = new SevenSegmentDisplay[2];

        for (int i = 1; i >= 0; --i) {
            byte digit = (byte)(number % 10);
            displays[i] = new SevenSegmentDisplay(digit);
            number /= 10;
        }

        return displays;
    }

}

