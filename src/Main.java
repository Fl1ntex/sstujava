import packege1_3_1.Student;
import paclege1_3_2.*;

public class Main {
    public static void main(String[] args){
        Point p1 = new Point(1,5);
        Point p2 = new Point(2,8);
        Point p3 = new Point(5,3);
        Line l = new Line(p1,p2);
        l.addPoint(p3);



        System.out.println(l);
    }
}
