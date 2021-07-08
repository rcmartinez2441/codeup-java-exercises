package warmups;

import java.util.Scanner;

public class Calculator {
    protected double num1;
    protected String userOperator;
    protected double num2;
    protected Scanner scanner = new Scanner(System.in);
    protected double finalCalc;
    //Create a command line calculator
    //the user may enter a number
    //the user may enter an operator
    //give the user an option (+, -, x, /)  and use a conditional to know which operation to do
    //don't try to convert the string input into an actual operator
    //the user may enter a second number
    //the program should output a result, then prompt the user to do another calculation (recursion)
    public Calculator () {
        getUserInput();
    }
    private void getUserInput () {
        System.out.println("Type in Your First Number");
        this.num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Type An Operator [ (+) OR (-) OR (*) OR (/) ]");
        this.userOperator = scanner.nextLine();

        System.out.println("Type in Second Number");
        this.num2 = scanner.nextInt();

        checkInput();
    }

    private void checkInput () {
        //Trying to Use Switch Statements
        switch (userOperator){
            case "+":
                this.finalCalc = num1 + num2;
                break;
            case "-":
                this.finalCalc = num1 - num2;
                break;
            case "*":
                this.finalCalc = num1 * num2;
                break;
            case "/":
                this.finalCalc = num1 / num2;
                break;
            default:
                this.finalCalc = 0;
                System.out.println("Not A Valid Operator");
                getUserInput();
                break;
        }
        returnInputAndResult();
    }

    private void returnInputAndResult () {
        System.out.printf("%s %s %s = %s\n", num1, userOperator, num2, finalCalc);
        scanner.nextLine();
        wannaTryAgain();
    }

    private void wannaTryAgain () {
        System.out.println("Would You like to Start a New Calculation? Y/N");
        String anotherOne = scanner.nextLine().toUpperCase();
        if(anotherOne.startsWith("Y")){
            getUserInput();
        } else if (anotherOne.startsWith("N")){
            System.out.println("Okay thank you, have a nice day");
        } else {
            System.out.println("Not a Valid Input");
            wannaTryAgain();
        }
    }
}