package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        //When super is called, it will take the current Square instance's method def for SetLength() and
        super(side, side);
    }

    public double getPerimeter() {
        return 2 * (super.getLength() + super.getWidth());
    }

    public double getArea() {
        return (super.getLength() * super.getWidth());
    }

    //Will allow you to update side while using same object instance
    public void setLength(double side) {
        super.width = super.length = side;
    }

    public void setWidth(double side) {
        super.width = super.length = side;
    }
//Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//    public Square (int side){
//        super(side, side);
//        getArea(side);
//        getPerimeter(side);
//    }
//
//    public int getArea (int side){
//        return 4 * side;
//    }
//
//    public int getPerimeter (int side) {
//        return (int)Math.pow(side, 2);
//    }
}