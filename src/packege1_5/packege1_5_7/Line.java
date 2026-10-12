package packege1_5.packege1_5_7;

import packege1_4.packege1_4_1.Point;

import java.util.ArrayList;
import java.util.Collections;


public class Line {
    private ArrayList<Point> array = new ArrayList<Point>();

    public Line(){

    }

    public Line(Point... array){
        isNullElemets(array);
        Collections.addAll(this.array, array);
    }

    public void addPoint(Point point){
        isNull(point);
        array.add(point);
    }

    public void addPoint(Point... point){
        isNull(point);
        Collections.addAll(array, point);
    }

    public double getLenghtLine() {
        if (array.size() >= 2){
            double rez = 0f;
            for (int i = 0; i < array.size() - 1; i++) {
                rez += getLenght(array.get(i),array.get(i+1));
            }
            return rez;
        }
        else{
            return 0f;
        }
    }

    private double getLenght(Point start,Point end){
        return Math.sqrt(Math.pow(start.getX() - end.getX(),2f) + Math.pow(start.getY() - end.getY(),2f));
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
        if (array != null){
            for (Point p:array){
                rez += p + ",";
            }
        }
        else{
            rez += "not have a point";
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