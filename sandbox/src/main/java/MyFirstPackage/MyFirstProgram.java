package MyFirstPackage;

import static java.lang.Math.sqrt;

public class MyFirstProgram {
    public static void main(String[] args) {
    Point A = new Point(1,1);
    Point B = new Point(5,4);
        System.out.println("расстояние между точками А и Б = " + distance(A,B));
    }
        public static double distance(Point X1,Point X2){
            return (sqrt((X1.x-X2.x)*(X1.x-X2.x)+(X1.y-X2.y)*(X1.y-X2.y)));
        }
        }

