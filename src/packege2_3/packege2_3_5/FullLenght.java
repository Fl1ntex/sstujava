package packege2_3.packege2_3_5;

import packege1_4.packege1_4_1.Point;
import packege1_5.packege1_5_7.Line;

public class FullLenght {
    public static double getFullLenght(GetFullLenght... array) {
        double res = 0;

        for (GetFullLenght i:array) {
            if (i == null) {
                throw new NullPointerException();
            }
            res += i.getLenght();
        }
        return res;
    }
}


//Line l1 = new Line(new Point(0, 0), new Point(3, 0), new Point(3, 4));
//
//
//packege1_6.packege1_6_6.Line l2 = new packege1_6.packege1_6_6.Line(new Point(0, 0), new Point(0, 5));
//
//double res = FullLenght.getFullLenght(l1, l2);
//
//        System.out.println(res);