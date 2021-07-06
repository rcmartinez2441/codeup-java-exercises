package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        //create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//        Rectangle box1 = new Rectangle(4,5);
//
//        //verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//        System.out.println("Length: " + box1.getLength());
//        System.out.println("Width: " + box1.getWidth());
//        System.out.println("Perimeter: " + box1.getPerimeter());
//        System.out.println("Area: " + box1.getArea());
//        System.out.println();
//        //create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        Rectangle box2 = new Square(5);
//        System.out.println("Length: " + box2.getLength());
//        System.out.println("Width: " + box2.getWidth());
//        System.out.println("Perimeter: " + box2.getPerimeter());
//        System.out.println("Area: " + box2.getArea());
        //verify that the getPerimeter and getArea methods return 20 and 25, respectively.


        //***** INTERFACES AND ABSTRACT CLASSES *****
        //Modify your ShapesTest class, use it to:
            //declare a variable of the type Measurable named myShape.
            //Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.

        Measurable myShape;
        myShape = new Rectangle(4,5);
        System.out.println("Area: " + myShape.getArea());
        System.out.println("Perimeter: " + myShape.getPerimeter());

        myShape = new Square(4.2);
        System.out.println("Area: " + myShape.getArea());
        System.out.println("Perimeter: " + myShape.getPerimeter());

        //Answer the following questions:
        //Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
            //* Because  Rectangle inherits from an abstract class and methods MUST be define if not, Rectangle will also be considered abstract and not compile

        //What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
            //* Measurable is
    }
}