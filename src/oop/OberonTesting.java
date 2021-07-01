package oop;

import oop.Oberon;

public class OberonTesting {
    public static void main(String[] args) {
//IN A
//  SEPARATE FILE, CREATE 3 INSTANCES OF THE OBERON CLASS AND
//  PRINT OUT A STRING THAT USES AT LEAST 3 OF THOSE PROPERTIES
//  TO DESCRIBE THAT OBERON INSTANCE.
        Oberon student1 = new Oberon("raul", "Java");
        student1.setAge(26);
        System.out.println(student1.getStudent());
        System.out.println(student1.getAge());
        student1.getCurrentCurriculum();
        student1.setQuizToday(true);
        student1.setJavaAffinityConfidence(70);
        student1.getJavaAffinityConfidence();
        System.out.println(student1.isQuizToday());
        System.out.println(student1.lineBreak);

        Oberon student2 = new Oberon("Corey", "Java");
        student2.setQuizToday(true);
        System.out.println(student2.isQuizToday());
        student2.getCurrentCurriculum();
        System.out.println("==========================");

        Oberon student3 = new Oberon("Sean", "Java");
        student3.setQuizToday(true);
        System.out.println(student3.isQuizToday());
        student3.getCurrentCurriculum();
    }
}