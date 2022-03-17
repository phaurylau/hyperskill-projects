package org.hyperskill.an.format;

import org.hyperskill.an.number.NumberWrapper;

public class KeyValueFormat implements DisplayFormatter {

    @Override
    public String start(int number) {
        return "\nProperties of " + number;
    }

    @Override
    public String display(NumberWrapper number) {
        return String.format("\n\t%s: %s", number.toString(), number.isSupportProperty());
    }
}
