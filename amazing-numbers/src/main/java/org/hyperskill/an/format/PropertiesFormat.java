package org.hyperskill.an.format;

import org.hyperskill.an.number.NumberWrapper;

public class PropertiesFormat implements DisplayFormatter {

    @Override
    public String start(int number) {
        return "\n\t\t" + number + " is";
    }

    @Override
    public String display(NumberWrapper numberWrapper) {
        if (numberWrapper.isSupportProperty()) {
            return " " + numberWrapper;
        }
        return "";
    }
}
