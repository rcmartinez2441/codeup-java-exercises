package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    private int minInt;
    private int maxInt;
    private double minDouble;
    private double maxDouble;

    public Input() {
        createScanner();
    }

    public void createScanner() { //Creates Scanner at new instance
        this.scanner = new Scanner(System.in);
    }

    public String userInput() { //Allows user to type in console
        return scanner.nextLine(); //Returns a string
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
    public void setMinMaxInt(int min, int max) {
        this.minInt = min;
        this.maxInt = max;
    }

    public void setMinMaxDouble (double min, double max){
        this.minDouble = min;
        this.maxDouble = max;
    }
    public int getInt() { //replaced parameter with private fields that can only be set calling the setters
        System.out.printf("Type a Number Between %s and %s\n", minInt, maxInt);
        int typedNumber = Integer.parseInt(userInput());
        if (typedNumber < minInt || typedNumber > maxInt) {
            System.out.println("That is out of range, please: ");
            getInt();
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

    public double getDouble(){
        System.out.printf("Type a Number Between %s and %s\n", minDouble, maxDouble);
        double typedNumber = Double.parseDouble(userInput());
        if (typedNumber < minDouble || typedNumber > maxDouble) {
            System.out.println("That is out of range, please: ");
            getDouble();
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