package MyFirstPackage;
import static java.lang.Math.sqrt;
public class Point {
        Double x;
        Double y;

        public double distance (Point Point2)
        {
        return sqrt(((x - Point2.x)*(x - Point2.x))+((y - Point2.y)*(y - Point2.y)));
        }
        }