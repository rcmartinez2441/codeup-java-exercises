package lectureNotes;

import java.util.ArrayList;
import java.util.Scanner;


public class ExceptionsLecture {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //An example of an Exemption
//        int myNum = Integer.parseInt("eighteen");
        //Exception Thrown: NumberFormatException
        //".parseInt expects a certain type of number and cannot read the string "eighteen" to convert it to Integer

//        ArrayList<Integer> myArrList = new ArrayList<Integer>();
//        myArrList.get(2);
        //Exceptions Thrown: Index 2 out of bounds for length 0

        impossible(8, 1);
        //Will throw


        System.out.println(isEligibleForBA());

//        System.out.println(ifEligibleForBA());
    }

    //**Throwing Exceptions Example and Syntax
    public static void impossible(int num1, int num2) {
        //what if num2 = 0? try to throw an exception
        if (num2 == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(num1 / num2);
        }

    }

    //Let’s say that you’re writing a program that checks whether or not a user is eligible to open up a new bank account. The requirements are that they have to be older than 16 years old and have at least $200 to start their bank account. Write a method that will return a string that states whether they’re eligible to bank at Banco di Laura or whether they are not eligible, make sure to  throw an `NumberFormatException` if the user doesn’t meet the requirements. changes to where the exception is being thrown
    public static String isEligibleForBA () {
        System.out.println("What's your age:");
        String age = scanner.nextLine();
        System.out.println("What is your current Balance");
        String balance = scanner.nextLine();

        try {
            if (Integer.parseInt(age) > 16 && Integer.parseInt(balance) > 200){
                return "You are Qualified";
            } else {
                return "You are not qualified";
            }
        } catch (Exception e){
            System.out.println("Invalid Input, please type a number");
            throw new NumberFormatException("Invalid Input, please type a number");
        }
    }

    public static String ifEligibleForBA() throws Exception {
        System.out.println("What's your age:");
        int age = scanner.nextInt();
        System.out.println("What is your current Balance");
        int balance = scanner.nextInt();

        if(age > 16 && balance > 200){
            return "Give us your money";
        } else {
            throw new Exception("Get out of here");
        }
    }
}