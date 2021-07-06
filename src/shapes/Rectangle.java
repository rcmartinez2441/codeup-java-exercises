package shapes;

public class Rectangle extends Quadrilateral implements Shape {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (super.getLength() + super.getWidth());
    }

    @Override
    public double getArea() {
        return (super.getLength() * super.getWidth());
    }
//    protected int length;
//    protected int width;
//
//    //Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//    public Rectangle (){}
//    //Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//    public int getArea(){
//        return this.length * this.width;
//    }
//    public int getPerimeter (){
//        return 2 * (this.length + this.width);
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }


}