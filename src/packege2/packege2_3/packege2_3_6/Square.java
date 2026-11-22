package packege2.packege2_3.packege2_3_6;

import packege1.packege1_4.packege1_4_1.Point;
import packege1.packege1_5.packege1_5_7.Line;
import packege2.packege2_1.packege2_1_2.ClosedLine;

import java.util.ArrayList;

public class Square {
    private Point start;
    private int lenght;

    public Square(int x, int y, int lenght){
        this(new Point(x,y),lenght);
    }

    public Square(Point p, int lenght){
        start = new Point(p);
        isValid(lenght);
        this.lenght = lenght;
    }

    public int getLenght(){
        return lenght;
    }

    public void setLenght(int lenght) {
        isValid(lenght);
        this.lenght = lenght;
    }

    private void isValid(int x){
        if (x <= 0){
            throw new IllegalArgumentException();
        }
    }

    public Line getLine(){
        ArrayList<Point> array = new ArrayList<>();
        Point p1 = new Point(start.getX(),start.getY());
        Point p2 = new Point(start.getX() + lenght,start.getY());
        Point p3 = new Point(start.getX() + lenght,start.getY() - lenght);
        Point p4 = new Point(start.getX(),start.getY() - lenght);
        return new ClosedLine(p1,p2,p3,p4,p1);
    }

    public String toString(){
        return "kvadrat v " + start + " and len " + lenght;
    }
}


//Square s = new Square(0,0,5);
//ClosedLine cl = (ClosedLine) s.getLine();
//        System.out.println(cl);