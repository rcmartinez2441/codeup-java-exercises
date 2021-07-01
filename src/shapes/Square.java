package shapes;

public class Square extends Rectangle {
    //Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
    public Square (int side){
        super(side, side);
        getArea(side);
        getPerimeter(side);
    }

    public int getArea (int side){
        return 4 * side;
    }

    public int getPerimeter (int side) {
        return (int)Math.pow(side, 2);
    }
}