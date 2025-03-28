package entities;

public abstract sealed class Clock permits BRClock, USClock {

    protected int hour;
    protected int minute;
    protected int second;

    protected Clock() {
    }

    protected Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String showClock() {
        return String.format("%d:%d:%d", hour, minute, second);
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24) {
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 60) {
            this.minute = 59;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60) {
            this.second = 59;
            return;
        }
        this.second = second;
    }

    public Clock convertClock(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        this.hour = clock.getHour();
        return this;
    }

}
