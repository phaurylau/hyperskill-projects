package org.hyperskill.an;

import java.util.Scanner;

public class Main {

    private static final String EXIT_SYMBOL = "0";

    public static void main(String... __) {
        printWelcome();
        printInstructions();
        String input = getUserInput();

        while (!input.equals(EXIT_SYMBOL)) {
            AmazingNumberController amazingNumberController = new AmazingNumberController(input);
            input = getUserInput();
        }
        System.out.println("\nGoodbye!");
    }

    private static void printWelcome() {
        System.out.println("Welcome to Amazing Numbers!");
    }

    private static void printInstructions() {
        System.out.println("\nSupported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("\t* the first parameter represents a starting number;");
        System.out.println("\t* the second parameter shows how many consecutive numbers are to be processed;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
    }

    private static String getUserInput() {
        System.out.print("\nEnter a request: > ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
