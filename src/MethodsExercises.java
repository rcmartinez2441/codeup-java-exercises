import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(add(2, 3));
        System.out.println(subtract(10, 5));
        System.out.println(multiply(6, 9));
        System.out.println(divide(20, 4));

        System.out.println("Enter a Number Between 1 and 10");
        int userInput = getInteger(1, 10);
        calcFactorial(userInput);


    }
    //Create four separate methods. Each will perform an arithmetic operation:
    //Addition
    //Subtraction
    //Multiplication
    //Division
    //Each function needs to take two parameters/arguments so that the operation can be performed.
    //Test your methods and verify the output.
    //Add a modulus method that finds the modulus of two numbers.

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    //Create a method that validates that user input is in a certain range
    //The method signature should look like this:
    /*
    public static int getInteger(int min, int max);
    ** and used like this:
    System.out.print("Enter a number between 1 and 10: ");
    int userInput = getInteger(1, 10);
     */
    public static void promptUser() {
        System.out.println("Enter a Number Between 1 and 10");
    }

    //refactor scanner as an argument
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userEntered = scanner.nextInt();
        if (userEntered >= 1 && userEntered <= 10) {
            System.out.println("Number is in Range");
        } else {
            System.out.println("Number is not in Range try again");
            promptUser();
            userEntered = getInteger(1, 10);
        }
        return userEntered;
    }

    //**3. Calculate the factorial of a number
    //Prompt the user to enter an integer from 1 to 10.
    //Display the factorial of the number entered by the user.
    //Ask if the user wants to continue.
    //Use a for loop to calculate the factorial.
    //Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //Use the long type to store the factorial.
    //Continue only if the user agrees to.
    //A factorial is a number multiplied by each of the numbers before it.
    //Factorials are denoted by the exclamation point (n!). Ex:
    /*
        1! = 1               = 1
        2! = 1 x 2           = 2
        3! = 1 x 2 x 3       = 6
        4! = 1 x 2 x 3 x 4   = 24
     */
    public static void calcFactorial(int typedNumber) {
        String factorialContainer = "";
        int total = 1;
        String currentFactorial = String.valueOf(1);
        int counter = typedNumber;
        for (int i = 1; i <= typedNumber; i++) {
            total = total * i;
            if (i == 1) {
                factorialContainer = whiteSpace(counter);
                System.out.printf("%s!  = %s   %s  = %s\n", i, currentFactorial, factorialContainer, total);
            } else if (i == 10) {
                currentFactorial += " x " + i;
                factorialContainer = whiteSpace(counter);
                System.out.printf("%s! = %s%s= %s\n", i, currentFactorial, factorialContainer, total);
                break;
            } else {
                currentFactorial = currentFactorial + " x " + i;
                factorialContainer = whiteSpace(counter);
                counter--;
                System.out.printf("%s! = %s%s  = %s\n", i, currentFactorial, factorialContainer, total);
            }

        }
    }

    public static String whiteSpace(int counter) {
        String spaceHolder = "    ";
        for (int i = 1; i <= counter; i++){
            spaceHolder += "    ";
        }
        return spaceHolder;
    }

    //NOT DONE NEED help with 4 and 5
}