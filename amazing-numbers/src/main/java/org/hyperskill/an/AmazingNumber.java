package org.hyperskill.an;

import org.hyperskill.an.format.DisplayFormatter;

public class AmazingNumber extends Number {

    public AmazingNumber(int value, DisplayFormatter displayFormatter) {
        this.displayFormatter = displayFormatter;
        this.value = value;
    }

    @Override
    public String getDescription() {
        return displayFormatter.start(this.value);
    }
}
