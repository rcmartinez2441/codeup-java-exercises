package oop;

public class Oberon {
    // TODO: CREATE A NEW "OBERON" CLASS WITH AT LEAST 6 PROPERTIES
//  THAT DESCRIBE OUR OBERON COHORT. MAKE SURE TO INCLUDE
//  AT LEAST THREE DIFFERENT TYPES OF DATA IN YOUR CLASS. IN A
//  SEPARATE FILE, CREATE 3 INSTANCES OF THE OBERON CLASS AND
//  PRINT OUT A STRING THAT USES AT LEAST 3 OF THOSE PROPERTIES
//  TO DESCRIBE THAT OBERON INSTANCE.
    private String student;
    private String currentCurriculum = "Java";
    private int age;
    private int javaAffinityConfidence;
    private boolean areYouConfident;
    private boolean isQuizToday;
    public String lineBreak = "===============================";

    public Oberon () {

    }
    public Oberon (String studentName, String currentCurriculum){
        this.student = studentName;
        this.currentCurriculum = currentCurriculum;
    }

    public String getStudent() {
        return student;
    }

    public String getCurrentCurriculum() {
        System.out.println("Currently Working on: " + currentCurriculum);
        return currentCurriculum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJavaAffinityConfidence() {
        System.out.println("My Current Java Confidence is about " + javaAffinityConfidence + "%" );
        return javaAffinityConfidence;
    }

    public void setJavaAffinityConfidence(int javaAffinityConfidence) {
        this.javaAffinityConfidence = javaAffinityConfidence;
    }

    public boolean isAreYouConfident() {
        return areYouConfident;
    }

    public void setAreYouConfident(boolean areYouConfident) {
        System.out.println("Are you confident on the current Curriculum?");
        this.areYouConfident = areYouConfident;
        isAreYouConfident();
    }

    public boolean isQuizToday() {
        return isQuizToday;
    }

    public void setQuizToday(boolean quizToday) {
        System.out.println("Quiz today?: " + quizToday);
        isQuizToday = quizToday;
    }

}