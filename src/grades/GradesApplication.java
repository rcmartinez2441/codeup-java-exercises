package grades;

import com.sun.jdi.request.StepRequest;
import util.Input;

import java.util.*;

public class GradesApplication {
    private static final HashMap<String, Student> students = new HashMap<>();
    private static final Input userInput = new Input();

    public static void main(String[] args) {

        //*** COLLECTIONS EXERCISES ***
        //================================================================================
//        #1)
//        Student student1 = new Student("Raul");
//        System.out.println(student1.getName());
//
//        for (int i = 69 ; i < 100  ; i+= 5) {
//            student1.addGrade(i);
//        }
//        System.out.println(student1.getGrades());
//
//        System.out.println("Average Grade: " + student1.getGradeAverage() );
//        System.out.println("=====================================================");
//        System.out.println();
        //================================================================================
//        #2

        //Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects
//        HashMap<String, Student> students = new HashMap<>();

        //Create at least 4 Student objects with at least 3 grades each, and add them to the map.
        //--------------------------------
        //Adding Students
        addStudent("jeffchan", "Jeff");
        addStudent("shrek420", "Shrek");
        addStudent("donkey6", "Donkey");
        addStudent("rcmartinez2441", "Raul");
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
        //==========================================================================

        // 3) Create the command line interface
        //Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.

        //After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.
        consoleInterface();
    }

    public static void addStudent( String username, String studentName){
        students.put(username, new Student(studentName));
    }

    public static void printStudentInfo (Student student){
        student.addGrade(student.getRandomGrades());

        System.out.println("Name: " + student.getName());
        System.out.println("Grades: " + student.getGrades());
        System.out.println("Grade Average: " + student.getGradeAverage());
        System.out.println("------------------------------------");
    }

    public static void consoleInterface (){
        showListOfUsers();
        //What student would you like to see more information on?
//        whatStudent(hashmap, applicationInput);

        //Sorry, no student found with the GitHub username of "pizza".

        //Would you like to see another student?

        //What student would you like to see more information on?

        //        > zgulde
        //        Name: Zach - GitHub Username: zgulde
        //        Current Average: 87.4

        //  Would you like to see another student?
        //
        //        > no
        //
        //  Goodbye, and have a wonderful day!
    }

    public static void showListOfUsers () {
        System.out.println("Here are the GitHub usernames of our students: \n");
        TreeMap<String, Student> sortedMap = new TreeMap<>();
        sortedMap.putAll(students);

        for (Map.Entry<String, Student> entry : sortedMap.entrySet()){
            System.out.print("|" + entry.getKey() + "| ");
        }
        System.out.println("\n");
        whatStudent();
    }

    public static void whatStudent () {
        System.out.println("Please type 'view all grades' to view all Student grades OR type username of Student you would like to view: ");
        String typedInput = userInput.userInput();
        checkInput(typedInput);
    }

    public static void checkInput (String userInput){
        if (userInput.equalsIgnoreCase("view all grades")){
            viewAllGrades();
            whatStudent();
        } else {
            if (students.containsKey(userInput)) {
                showStudentDetails(userInput);
            } else {
                System.out.println("\nThat's not a valid entry\n");
                tryAgain();
            }
        }
    }

    public static void showStudentDetails (String userTyped) {
        System.out.println();
        System.out.println("Student Name: " + students.get(userTyped).getName());
        System.out.println("Github Username: " + userTyped);
        System.out.println("Grade Average: " + students.get(userTyped).getGradeAverage());
        System.out.println();
        tryAgain();
    }

    public static void tryAgain (){
        boolean continueApp = userInput.yesNo("Would you like to see another Student? Y/N \n");
        if(continueApp){
            consoleInterface();
        } else {
            System.out.println("\n-------------- Goodbye, have a good day ------------------");
        }
    }

    public static void viewAllGrades (){
        Map<String, Student> map = students;
        TreeMap<String, Student> treemap = new TreeMap<>();
        treemap.putAll(map);
        System.out.println(treemap);
        //Map.Entry<K, V> just allows you to store a key/value data set and store it as an object, almost like an object in an array in JS
        System.out.println("------------------- Viewing All Grades ---------------------");
        for (Map.Entry<String, Student> studentKeyValue : treemap.entrySet()){
            Student currentStudent = treemap.get(studentKeyValue.getKey()); //student.getKey will return current iteration's key (AKA github username) in string and then tree.get will use that to find VALUE in Student obj for .getName()
            System.out.println(currentStudent.getName());
            System.out.println(currentStudent.getGrades());
        }
    }
}