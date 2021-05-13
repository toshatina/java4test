package MyFirstPackage;

import static java.lang.Math.sqrt;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Point A = new Point(1,1);
    Point B = new Point(1,1);
    public static double distance(Point A, Point B) {
        return (sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y)));
    }

}

