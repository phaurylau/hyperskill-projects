package org.hyperskill.an.number;

import org.hyperskill.an.Number;

public class Buzz extends NumberWrapper {

    private final Number number;

    private final boolean isSupportProperty;

    public Buzz(Number number) {
        this.number = number;
        this.value = number.getValue();
        this.isSupportProperty = isBuzz();
        this.displayFormatter = number.getDisplayFormatter();
    }

    public boolean isSupportProperty() {
        return isSupportProperty;
    }

    @Override
    public String getDescription() {
        return number.getDescription() + number.getDisplayFormatter().display(this);
    }

    public boolean isBuzz() {
        return value % 10 == 7 || value % 7 == 0;
    }

    @Override
    public String toString() {
        return "buzz";
    }
}
