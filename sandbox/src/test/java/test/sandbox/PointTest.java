package test.sandbox;

import MyFirstPackage.Point;
import org.testng.Assert;
import org.testng.annotations.Test;
import static java.lang.Math.sqrt;

public class PointTest {
    @Test
    public void testArea() {

        Point N = new Point(2.0,1.0);
        Point B = new Point(1.0,1.0);
        Assert.assertEquals( N.distance(B),1.0);
        Point С = new Point(-1.0,-1.0);
        Point D = new Point(-4, -5);
        Assert.assertEquals(С.distance(D),5.0);
        Point K = new Point(1.0,1.0);
        Point L = new Point(1.0,1.0);
        Assert.assertEquals( L.distance(K),0);
        K = new Point(0,0);
        Assert.assertEquals( L.distance(K),sqrt(2));
    }
}
