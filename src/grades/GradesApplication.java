package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        //*** COLLECTIONS EXERCISES ***
        //================================================================================
//        #1)
        Student student1 = new Student("Raul");
        System.out.println(student1.getName());

        for (int i = 69 ; i < 100  ; i+= 5) {
            student1.addGrade(i);
        }
        System.out.println(student1.getGrades());

        System.out.println("Average Grade: " + student1.getGradeAverage() );
        System.out.println("=====================================================");
        System.out.println();
        //================================================================================
//        #2

        //Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects
        HashMap<String, Student> students = new HashMap<>();

        //Create at least 4 Student objects with at least 3 grades each, and add them to the map.
        //--------------------------------
        //Adding Students
        addStudent(students, "jeffchan", "Jeff");
        addStudent(students, "shrek420", "Shrek");
        addStudent(students, "donkey6", "Donkey");
        addStudent(students, "rcmartinez2441", "Raul");
        //Set a reference point to get Jeff's , Student Class from Hashmap
        Student jeff = students.get("jeffchan");
        Student shrek = students.get("shrek420");
        Student donkey = students.get("donkey6");
        Student raul = students.get("rcmartinez2441");

        //Create a Override Method to Add Multiple Grades at Once
        printStudentInfo(jeff);
        printStudentInfo(shrek);
        printStudentInfo(donkey);
        printStudentInfo(raul);


        //Create the command line interface
        //
        //Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.
        //
        //After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.

        /*
        Welcome!

        Here are the GitHub usernames of our students:

        |zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|

        What student would you like to see more information on?

        > pizza

        Sorry, no student found with the GitHub username of "pizza".

        Would you like to see another student?

        > y

        What student would you like to see more information on?

        > zgulde

        Name: Zach - GitHub Username: zgulde
        Current Average: 87.4

        Would you like to see another student?

        > no

        Goodbye, and have a wonderful day!
         */
    }

    public static void addStudent( HashMap<String, Student> currentHashmap, String username, String studentName){
        currentHashmap.put(username, new Student(studentName));

    }

    public static void printStudentInfo (Student student){
        student.addGrade(student.getRandomGrades());

        System.out.println("Name: " + student.getName());
        System.out.println("Grades: " + student.getGrades());
        System.out.println("Grade Average: " + student.getGradeAverage());
        System.out.println("------------------------------------");
    }


}