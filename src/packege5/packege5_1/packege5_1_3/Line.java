package packege5.packege5_1.packege5_1_3;

import packege1.packege1_4.packege1_4_1.Point;
import packege2.packege2_3.packege2_3_5.GetFullLenght;


public class Line implements GetFullLenght {
    private Point start;
    private Point end;

    public Line(Point p1, Point p2){
        isNull(p1);
        isNull(p2);
        start = new Point(p1);
        end = new Point(p2);
    }

    public void setPointStart(Point pointStart){
        start = new Point(pointStart);
    }

    public void setPointEnd(Point pointEnd){
        end = new Point(pointEnd);
    }

    public Point getStart() {
        return new Point(start);
    }

    public Point getEnd() {
        return new Point(end);
    }

    public Line(int x1, int y1, int x2, int y2){
        start = new Point(x1,y1);
        end = new Point(x2,y2);
    }

    public double getLenght(){
        return Math.sqrt(Math.pow(start.getX() - end.getX(),2f) + Math.pow(start.getY() - end.getY(),2f));
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

    @Override
    public int hashCode(){
        return start.hashCode() + end.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null) return false;
        if (o.getClass() != getClass()) return false;
        Line l = (Line) o;
        if (start.equals(((Line) o).getStart()) && end.equals(((Line) o).getEnd())){
            return true;
        }
        if (end.equals(((Line) o).getStart()) && start.equals(((Line) o).getEnd())){
            return true;
        }
        return false;
    }

}

