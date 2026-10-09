package packege1_5.packege1_5_3;

import packege1_4.packege1_4_1.Point;


public class Line {
    private Point start;
    private Point end;

    public Line(Point p1, Point p2){
        isNull(p1);
        isNull(p2);
        start = p1;
        end = p2;
    }

    public Line(int x1, int y1, int x2, int y2){
        start = new Point(x1,y1);
        end = new Point(x2,y2);
    }

    public int getLenght(){
        return (int)Math.sqrt(Math.pow(start.getX() - end.getX(),2f) + Math.pow(start.getY() - end.getY(),2f));
    }


    private void isNull(Object val){
        if (val == null){
            throw new NullPointerException();
        }
    }

    @Override
    public String toString(){
        String rez = "Line: " + start + end;
        return rez;
    }
}

