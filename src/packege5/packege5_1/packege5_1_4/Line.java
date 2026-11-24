package packege5.packege5_1.packege5_1_4;

import packege1.packege1_4.packege1_4_1.Point;
import packege2.packege2_1.packege2_1_2.ClosedLine;
import packege2.packege2_3.packege2_3_5.GetFullLenght;

import java.util.*;


public class Line implements GetFullLenght {
    private ArrayList<Point> array = new ArrayList<>();

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

    public int getSizeArray(){
        return array.size();
    }

    public ArrayList<Point> getArray(){
        return new ArrayList<>(array);
    }

    public double getLenght() {
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

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (o.getClass() == getClass() ) {
            Line l = (Line) o;
            if (this.getSizeArray() != l.getSizeArray()) return false;
            for (int i = 0; i < getSizeArray(); i++){
                if (!array.get(i).equals(l.getArray().get(i))) {
                    return false;
                }
            }
            return true;
        }
        else if (o.getClass() == ClosedLine.class){
            ClosedLine cl = (ClosedLine) o;
            if (getSizeArray() + 1 != cl.getSizeArray()) return false;
            return true;
            // НЕ ГОТОВО
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(array);
    }
}
