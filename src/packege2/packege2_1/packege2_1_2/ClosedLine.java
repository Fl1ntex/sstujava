package packege2.packege2_1.packege2_1_2;

import packege1.packege1_4.packege1_4_1.Point;
import packege1.packege1_5.packege1_5_7.Line;

import java.util.ArrayList;
import java.util.Collections;


public class ClosedLine extends Line {
    private ArrayList<Point> array = new ArrayList<Point>();

    public ClosedLine(){

    }

    public ClosedLine(Point... array) {
        if (array.length >= 3){
            if (array[0].getX() == array[array.length - 1].getX()){
                if (array[0].getY() == array[array.length - 1].getY()){
                    Collections.addAll(this.array,array);
                    return;
                }
            }
        }
        throw new RuntimeException("start and end dolgnu buti ==");
    }

    public int getSizeArray(){
        return array.size();
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
