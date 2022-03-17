package org.hyperskill.an.number;

import org.hyperskill.an.Number;

public class Palindromic extends NumberWrapper {

    private final Number number;
    private final boolean isSupportProperty;

    public Palindromic(Number number) {
        this.number = number;
        this.value = number.getValue();
        this.isSupportProperty = isPalindromic();
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

    public boolean isPalindromic() {
        String converted = String.valueOf(value);
        final int size = converted.length();
        if (size == 1) {
            return true;
        }

        for (int i = 0; i < size; i++) {
            if (converted.charAt(i) != converted.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "palindromic";
    }
}
