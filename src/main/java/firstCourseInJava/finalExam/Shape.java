package firstCourseInJava.finalExam;

abstract class Shape {
    // this private access modifier forces me to use inner subclasses
    private int sides;

    abstract double area();

    int sides() {
        return sides;
    }

    public class Rectangle extends Shape {
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
            sides = 4;
        }

        @Override
        double area() {
            return length * width;
        }
    }

    public class Triangle extends Shape {
        double height;
        double base;

        Triangle(double height, double base) {
            this.height = height;
            this.base = base;
            sides = 3;
        }

        @Override
        double area() {
            return (height * base) / 2;
        }
    }

    public class Square extends Shape {
        double side;

        Square(double side) {
            this.side = side;
        }

        @Override
        double area() {
            return side * side;
        }
    }

}
