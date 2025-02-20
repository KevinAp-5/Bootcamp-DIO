package entities;

public non-sealed class USClock extends Clock{
    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPeriodIndicatorToPM() {
        this.periodIndicator = "PM";
    }

    public void setPeriodIndicatorToAM() {
        this.periodIndicator = "AM";
    }

    @Override
    public void setHour(int hour) {
        setPeriodIndicatorToAM();
        if (hour > 12 && hour <= 23) {
            setPeriodIndicatorToPM();
            this.hour = hour - 12;
        }
        else if (hour <= 24) {
            this.hour = 0;
        }
        else {
            this.hour = hour;
        }

    }

    @Override
    public Clock convertClock(Clock clock) {
        super.convertClock(clock);
        if (clock instanceof BRClock brClock) {
            this.setHour(brClock.getHour());
        }
        else if (clock instanceof USClock usClock) {
            this.hour = usClock.getHour();
            this.periodIndicator = usClock.getPeriodIndicator();
        }
        return this;
    }

}
