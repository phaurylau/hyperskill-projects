package org.hyperskill.an.number;

import org.hyperskill.an.Number;
import org.hyperskill.an.format.DisplayFormatter;

public class Duck extends NumberWrapper {

    private final Number number;
    private final boolean isSupportProperty;

    public Duck(Number number) {
        this.number = number;
        this.value = number.getValue();
        this.isSupportProperty = isDuck();
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

    public boolean isDuck() {
        return String.valueOf(value).substring(1).contains("0");
    }

    @Override
    public String toString() {
        return "duck";
    }
}
