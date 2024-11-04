package pointLine;

public class Point {
    private double x, y;

    public Point () {
        this.x = 0;
        this.y = 0;
    }

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point (Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return  ("Point has two  coordinates " + getX() + "," +  getY());
    }
}