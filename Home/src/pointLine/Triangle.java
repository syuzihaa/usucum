package pointLine;



import java.io.PipedOutputStream;

public class Triangle {
    private double x, x1, y, y1, x2, y2;

    public Triangle(double x, double x1, double y, double y1, double x2, double y2) {
        this.x = x;
        this.x1 = x1;
        this.y = y;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Triangle(Point point, Point point1, Point point2) {
        this.x = point.getX();
        this.y = point.getY();
        this.x1 = point1.getX();
        this.y1 = point1.getY();
        this.x2 = point2.getX();
        this.y2 = point2.getY();
    }

    public Triangle(Triangle triangle) {
        this.x = triangle.x;
        this.x1 = triangle.x1;
        this.y = triangle.y;
        this.y1 = triangle.y1;
        this.x2 = triangle.x2;
        this.y2 = triangle.y2;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double perimeter() {
        Line l = new Line(x, y, x1, y1);
        Line l1 = new Line(x1, y1, x2, y2);
        Line l2 = new Line(x2, y2, x, y);
        double perimeter = l.lengh() + l1.lengh() + l2.lengh();
        return perimeter;
    }

    public double area() {
        return 0.5 * Math.abs(x * (y1 - y2) + x1 * (y2 - y) + x2 * (y - y1));
    }

    public Point centerOfMass() {
        double centroidX = (x1 + x2 + x) / 3;
        double centroidY = (y1 + y2 + y) / 3;
        return new Point(centroidX, centroidY);
    }

    public boolean isEquilateral() {
        Line l = new Line(x, y, x1, y1);
        Line l1 = new Line(x1, y1, x2, y2);
        Line l2 = new Line(x2, y2, x, y);
        if (l.lengh() == l2.lengh() && l1.lengh() == l.lengh()) {
            System.out.println("The triangle is equilateral.");
            return true;
        }
        return false;
    }

    public boolean isIsosceles() {
        Line l = new Line(x, y, x1, y1);
        Line l1 = new Line(x1, y1, x2, y2);
        Line l2 = new Line(x2, y2, x, y);
        if (l.lengh() == l1.lengh() || l.lengh() == l2.lengh() || l1.lengh() == l2.lengh()) {
            System.out.println("The triangle is isosceles.");
            return true;
        }
        return false;
    }
    public boolean isSceles() {
        Line l = new Line(x, y, x1, y1);
        Line l1 = new Line(x1, y1, x2, y2);
        Line l2 = new Line(x2, y2, x, y);
        if (l.lengh() != l1.lengh() && l.lengh() != l2.lengh() && l1.lengh() != l2.lengh()) {
            System.out.println("The triangle is sceles.");
            return true;
        }
        return false;
    }
    public String toString() {
        return  ("Triangle has three lines with parameters:  " +  "area: "  + area() + ", centerOfMass: "+ centerOfMass()
                + ", isEquilateral: " + isEquilateral() + ", isIsosceles: " +isIsosceles() + " , isSceles" + isSceles());
    }

}
