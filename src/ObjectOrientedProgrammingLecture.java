import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ObjectOrientedProgrammingLecture {
    public static void main(String[] args) {
//        String tryChangingMe = "hello, hello"; //Original Reference for tryChangingMe
//        System.out.println("Reference Code: " + tryChangingMe.hashCode());
//        changeString(tryChangingMe);
//        System.out.println(tryChangingMe);

        //Example 2
//        int num = 5;
//        anotherMethod(num);

        //Recursion
        Scanner scanner = new Scanner(System.in);

//        System.out.println("How many seats are there in the movie" + "theather");
//
//        int seatsLeft = scanner.nextInt();
//        movieTheatre(seatsLeft);

        //TODO: Marathon Exercise
        System.out.println("How many miles are you planning to run today?");
        marathonMileTracker( promptUser() );
    }

    //Passing by value, is like passing copy of an object, we are going to grab the value and not change the original value
//    public static void changeString(String randomString) { //randomString is a COPY of value of tryChangingMe
//        System.out.println("Reference Code Before: " + randomString.hashCode()); //Hashcode is like the location where it is stored in memory
//        randomString = "something new"; // "hello, hello" --> "something new" but copy's value changes, not original variable
//        System.out.println("Reference Code After: " + randomString.hashCode()); // After changing the value of random string the hashcode changes  showing that they not stored in same location making it a copy
//        System.out.println(randomString); //we are now referencing "randomString"
//    }

//    public static void anotherMethod(int randomNum) {
//        System.out.println(randomNum); // 5
//    }


    //Recursion is like running a loop but will save memory since creating a loop will store that loop in memory
//    public static void movieTheatre(int numSeats) {
//        if (numSeats > 0) {
//            System.out.println("There are " + numSeats + " available");
//            numSeats--;
//            System.out.println("numSeats:" + numSeats);
//            movieTheatre(numSeats);
//        }
//    }

/*

 */
    //    TODO: you are a sports manager. Prompt your client who is training
    //     for a marathon how many miles they have to run today. You're the
    //     coach, so you decide how many miles they ran that day. create a method that takes in how many miles that have left in training and simulate that they check in with you after every 2 miles. print out
    //     how many miles they have left in training until they have 0 miles
    //     left.

    public static int promptUser () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void marathonMileTracker (int milesToRun){
        System.out.println("Total Miles Left to Run: " + milesToRun);
        //I decide how many miles they ran in a day
        if (milesToRun > 0){
            milesToRun -= 1;
            System.out.println("Ran 1 Mile");
            if (milesToRun % 2 == 0) {
                System.out.println("2 Mile Check");
            }
            marathonMileTracker(milesToRun);
        } else {
            System.out.println("Daily Miles Completed");
        }

    }

}