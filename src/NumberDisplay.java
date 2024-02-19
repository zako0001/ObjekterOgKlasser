public class NumberDisplay {

    // Attributes
    private int limit;
    private int value;

    // Constructor
    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }

    // Getters
    public int getValue() {
        return value;
    }
    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }

    // Setter
    public void setValue(int replacementValue) {
        if (replacementValue >= 0 && replacementValue < limit) {
            value = replacementValue;
        }
    }

    // Incrementer
    public void increment() {
        value = ++value % limit;
    }
}