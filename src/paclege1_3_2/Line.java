package paclege1_3_2;

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

    public String toString(){
        String rez = "Line: ";
        for (Point p:array){
            rez += p + ",";
        }
        return rez;
    }
}
