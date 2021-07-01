package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input inputClass = new Input();

        double radius = inputClass.getDouble("Type In A Radius");
        Circle circle = new Circle(radius); //prompts user for radius and calls two functions to return area and circumference

        circle.createNewCircle(inputClass.yesNo("Do you want to create a new circle? Y/N"), inputClass, "Do you want to create a new Circle? Y/N");



    }
}