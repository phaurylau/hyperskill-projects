package org.hyperskill.an.number;

import org.hyperskill.an.Number;

public class Odd extends NumberWrapper {

    private final Number number;
    private final boolean isSupportProperty;

    public Odd(Number number) {
        this.number = number;
        this.value = number.getValue();
        this.isSupportProperty = isOdd();
        this.displayFormatter = number.getDisplayFormatter();
    }

    @Override
    public String getDescription() {
        return number.getDescription() + displayFormatter.display(this);
    }

    @Override
    public boolean isSupportProperty() {
        return isSupportProperty;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    @Override
    public String toString() {
        return "odd";
    }
}
