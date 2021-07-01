package shapes;

import util.Input;

public class Circle {
    private double radius;
    public int counter = 1;

    public Circle (double radius){
        this.radius = radius;
        getArea();
        getCircumference();
    }

    public double getArea () {
        double area = Math.PI * Math.pow(this.radius,2);
        System.out.println("Area of Circle is: " + area );
        return area;
    }
    public double getCircumference () {
        double circumference = 2 * Math.PI * this.radius;
        System.out.println("Circumference of Circle is: " + circumference);
        return circumference;
    }

    public void createNewCircle (boolean yesNo, Input input, String prompt){
        if (yesNo){
            double newRadius = input.getDouble("Enter New Radius");
            Circle newCircle = new Circle(newRadius);
            setCounter(counter);
            System.out.println("Circle #: " + getCounter() + "\n");
            createNewCircle(input.yesNo(prompt), input, prompt);
        } else {
            prompt = "Okay Have a Nice Day";
            System.out.println(prompt);

        }


    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        counter++;
        this.counter = counter;
    }
}