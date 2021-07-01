package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public int minInt;
    public int maxInt;
    public double minDouble;
    public double maxDouble;

    public Input() {
        createScanner();
    }

    public void createScanner() { //Creates Scanner at new instance
        this.scanner = new Scanner(System.in);
    }

    public String userInput() { //Allows user to type in console
        return scanner.next(); //Returns a string
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String input = userInput();
        return "Here's you Input: " + input;

    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = userInput();
        if (userInput.toUpperCase().startsWith("Y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Type a Number Between %s and %s\n", min, max);
        int typedNumber = Integer.parseInt(userInput());
        if (typedNumber < min || typedNumber > max) {
            System.out.println("That is out of range, please: ");
            getInt(min, max);
        } else {
            System.out.println("Your Typed: " + typedNumber);
            return typedNumber;
        }
        return typedNumber;
    }

    public int getInt (String prompt){
        System.out.println(prompt);
        int typedNumber = Integer.parseInt(userInput());
        System.out.println("You Typed: " + typedNumber);
        return typedNumber;
    }

    public double getDouble(double min, double max, String prompt){
        System.out.printf(prompt, min, max);
        double typedNumber = Double.parseDouble(userInput());
        if (typedNumber < min || typedNumber > max) {
            System.out.println("That is out of range, please: ");
            getDouble(min, max, prompt);
        } else {
            System.out.println("Your Typed: " + typedNumber);
            return typedNumber;
        }
        return typedNumber;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        double typedNumber = Double.parseDouble(userInput());
        System.out.println("You Typed: " + typedNumber);
        return typedNumber;
    }


}