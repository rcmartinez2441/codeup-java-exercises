package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.studentName;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void addGrade(Integer[] gradesArray){
        for (int grade : gradesArray){
            this.grades.add(grade);
        }
    }

    public void addGrade(ArrayList<Integer> randomGradesArray){
        for(Integer grade : randomGradesArray){
            this.grades.add(grade);
        }
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for(Integer grade : grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public ArrayList<Integer> getRandomGrades () {
        ArrayList<Integer> randomGrades = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int randomGrade = (int)Math.floor( (Math.random() * 31) + 69);
            randomGrades.add(randomGrade);
        }
        return randomGrades;
    }
}