package org.hyperskill.an.number;

import org.hyperskill.an.Number;

public class Even extends NumberWrapper {

    private final Number number;
    private final boolean isSupportProperty;

    public Even(Number number) {
        this.number = number;
        this.value = number.getValue();
        this.isSupportProperty = isEven();
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

    public boolean isEven() {
        return value % 2 == 0;
    }

    @Override
    public String toString() {
        return "even";
    }
}
