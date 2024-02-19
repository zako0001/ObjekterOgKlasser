public class ClockDisplay {

    // Attributes
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    // Constructor
    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    // Getter
    public String getDisplayValue() {
        return displayString;
    }

    // Incrementer
    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    // Auxiliary method
    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
