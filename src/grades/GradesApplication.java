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

        System.out.println(jeff.getRandomGrades());
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

    //***What do you think is working
    // Lectures work very well with understanding curriculum subjects especially after reading ahead and being lost while reading it
    //Allowing for open discussion and elaborating on questions answered helps alot


    //***What is what we can improve on
    //Sometimes the curriculum instructions are unclear or confusing which makes it difficult to find out if I am doing the exercises correctly or not
    //Wish that the curriculum gave more examples


    //Ideas for Solutions

}