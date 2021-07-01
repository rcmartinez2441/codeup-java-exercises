package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public int min;
    public int max;

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

    public boolean yesNo() {
        System.out.println("yesNo?");
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

//    public int getInt (){
//
//    }
//
//    public double getDouble(double min, double max){
//
//    }
//
//    public double getDouble(){
//
//    }


}