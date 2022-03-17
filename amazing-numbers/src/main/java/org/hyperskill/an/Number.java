package org.hyperskill.an;

import org.hyperskill.an.format.DisplayFormatter;

public abstract class Number {

    protected DisplayFormatter displayFormatter;

    protected int value;

    public abstract String getDescription();

    public int getValue() {
        return value;
    }

    public DisplayFormatter getDisplayFormatter() {
        return displayFormatter;
    }
}
