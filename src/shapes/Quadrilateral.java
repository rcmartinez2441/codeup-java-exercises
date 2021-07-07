package shapes;
abstract class Quadrilateral implements Shape {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        //Will allow you to set "default" length width
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}