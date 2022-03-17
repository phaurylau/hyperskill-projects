package org.hyperskill.an.number;

import org.hyperskill.an.Number;

public class Gapful extends NumberWrapper {

    private final Number number;
    private final boolean isSupportProperty;

    public Gapful(Number number) {
        this.number = number;
        this.value = number.getValue();
        this.isSupportProperty = isGapful();
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

    public boolean isGapful() {
        String convertedNumber = String.valueOf(this.value);
        int length = convertedNumber.length();
        if (length > 2) {
            String twoDigits = convertedNumber.charAt(0) + String.valueOf(convertedNumber.charAt(length - 1));
            return this.value % Integer.parseInt(twoDigits) == 0;
        }
        return false;
    }

    @Override
    public String toString() {
        return "gapful";
    }
}
