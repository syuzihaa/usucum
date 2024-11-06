package pointLine;

public class Line {
    private double x, x1, y, y1;

    public Line(double x, double x1, double y, double y1) {
        this.x = x;
        this.x1 = x1;
        this.y = y;
        this.y1 = y1;
    }

    public Line(Point p, Point p1) {
        this.x = p.getX();
        this.x1 = p1.getX();
        this.y = p.getY();
        this.y1 = p1.getY();
    }

    public Line(Line line) {
        this.x = line.x;
        this.x1 = line.x1;
        this.y = line.y;
        this.y1 = line.y1;
    }

    public double lengh() {
        return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow((y1 - y), 2));
    }

    public Point midPoint() {
        double midX = (x + x1) / 2;
        double midY = (y + y1) / 2;
        return new Point(midX, midY);
    }

    public String toString() {
        return  ("Line has two points with coordinates " + x + "," + y + " and " + x1 + "," +y1);
    }
}