package MyFirstPackage;

import static java.lang.Math.sqrt;

public class MyFirstProgram {
    public static void main(String[] args) {
    Point A = new Point();
    Point B = new Point();
    A.x=1.0;
    A.y=1.0;
    B.x=4.0;
    B.y=1.0;


        System.out.println("расстояние между точками А и Б = " + A.distance(B));
    }
        }

