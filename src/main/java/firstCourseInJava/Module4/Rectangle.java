package firstCourseInJava.Module4;

public class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double returnArea(){
        double area = length * width;
        return area;
    }

    public double returnPerimeter() {
        double perimeter = length + length + width + width;
        return perimeter;
    }
}
