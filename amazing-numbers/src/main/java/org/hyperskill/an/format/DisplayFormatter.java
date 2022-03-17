package org.hyperskill.an.format;

import org.hyperskill.an.Number;
import org.hyperskill.an.number.NumberWrapper;

public interface DisplayFormatter {

    String start(int number);

    String display(NumberWrapper number);
}
