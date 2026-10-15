package packege1_6.packege1_6_3;

import packege1_4.packege1_4_1.Point;
import packege1_5.packege1_5_7.Line;

import java.util.ArrayList;

public class Square {
    private Point start;
    private int lenght;

    public Square(int x, int y, int lenght){
        this(new Point(x,y),lenght);
    }

    public Square(Point p, int lenght){
        start = new Point(p);
        if (lenght <= 0){
            throw new IllegalArgumentException();
        }
        this.lenght = lenght;
    }

    public int getLenght(){
        return lenght;
    }

    public void setLenght(int lenght) {
        if (lenght <= 0){
            throw new IllegalArgumentException();
        }
        this.lenght = lenght;
    }

    public Line getLine(){
        ArrayList<Point> array = new ArrayList<>();
        Point p1 = new Point(start.getX(),start.getY());
        Point p2 = new Point(start.getX() + lenght,start.getY());
        Point p3 = new Point(start.getX() + lenght,start.getY() - lenght);
        Point p4 = new Point(start.getX(),start.getY() - lenght);
        return new Line(p1,p2,p3,p4);
    }

    public String toString(){
        return "kvadrat v " + start + " and len " + lenght;
    }
}
