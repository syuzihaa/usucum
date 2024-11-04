package pointLine;



public class TriangleDemo {
    public static void main(String[] args) {
        double x = 10, x1 = 15, x2 = 15, y = 5.7, y1 = 8.5, y2 = 15;

        Triangle triangle = new Triangle(x, y, x1, y1, x2, y2);
        Triangle trianglePoints = new Triangle(new Point(x, y), new Point(x1, y1), new Point(x2, y2));
        Triangle triangleCopy = new Triangle(triangle);

        System.out.println(triangle);
        System.out.println(trianglePoints);
        System.out.println(triangleCopy);
    }
}
