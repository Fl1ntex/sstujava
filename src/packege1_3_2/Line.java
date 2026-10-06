package packege1_3_2;

import java.util.Arrays;


public class Line {
    private Point[] array;

    public Line(Point... array){
        isNullElemets(array);
        this.array = Arrays.copyOf(array,array.length);
    }

    public void addPoint(Point point){
        isNull(point);
        array = Arrays.copyOf(array,array.length + 1);
        array[array.length - 1] = point;
    }

    private void isNull(Object val){
        if (val == null){
            throw new NullPointerException();
        }
    }
    private void isNullElemets(Object[] val){
        isNull(val);
        for (Object o:val){
            isNull(o);
        }
    }

    @Override
    public String toString(){
        String rez = "Line: ";
        for (Point p:array){
            rez += p + ",";
        }
        return rez;
    }
}

//Point p1 = new Point(1,5);
//Point p2 = new Point(2,8);
//Point p3 = new Point(5,3);
//Line l1 = new Line(p1,p2);
//        l1.addPoint(p3);
//
//Point p4 = new Point(2,-5);
//Point p5 = new Point(4,-8);
//
//Line l2 = new Line(p1,p4,p5,p3);
//
//        System.out.println(l1);
//        System.out.println(l2);
//
//        p1.setX(10);
//
//        System.out.println(l1);
//        System.out.println(l2);