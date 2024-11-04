package pointLine;

public class LineDemo {
    public static void main(String[] args) {

        double x = 10, x1 = 15.5, y = 5, y1 = 17;

        Line line = new Line(x, x1, y, y1);
        System.out.println(line.lengh());
        System.out.println("Midpoint - " + line.midPoint().toString());
    }
}