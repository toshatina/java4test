package MyFirstPackage;
import static java.lang.Math.sqrt;
public class Point {
        Double x;
        Double y;
        public Point(double x, double y)
        {
                this.x = x;
                this.y = y;
        }
        public double distance (Point Point2)
        {
        return sqrt(((this.x - Point2.x)*(this.x - Point2.x))+((this.y - Point2.y)*(this.y - Point2.y)));
        }
        }