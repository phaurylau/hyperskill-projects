package org.hyperskill.an;

import org.hyperskill.an.format.DisplayFormatter;
import org.hyperskill.an.format.KeyValueFormat;
import org.hyperskill.an.format.PropertiesFormat;
import org.hyperskill.an.number.*;

public class AmazingNumberController {

    public AmazingNumberController(String userInput) {
        DisplayFormatter formatter = new KeyValueFormat();
        String[] params = userInput.split(" ");
        int num = Integer.parseInt(params[0]);
        int end = num + 1;
        if (params.length > 1) {
            end = num + Integer.parseInt(params[1]);
            formatter = new PropertiesFormat();
        }

        for (var i = num; i < end; i++) {
            Number amazingNumber = new AmazingNumber(i, formatter);
            amazingNumber = new Buzz(amazingNumber);
            amazingNumber = new Duck(amazingNumber);
            amazingNumber = new Palindromic(amazingNumber);
            amazingNumber = new Gapful(amazingNumber);
            amazingNumber = new Even(amazingNumber);
            amazingNumber = new Odd(amazingNumber);
            System.out.println(amazingNumber.getDescription());
        }
    }
}
