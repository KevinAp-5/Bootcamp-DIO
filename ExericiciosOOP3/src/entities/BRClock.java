package entities;

public non-sealed class BRClock extends Clock {

    @Override
    public Clock convertClock(Clock clock) {
        super.convertClock(clock);
        if (clock instanceof USClock usClock)
            this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() + 12 : usClock.getHour();
        return this;
    }

}
