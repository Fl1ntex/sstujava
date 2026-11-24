package packege5.packege5_1.packege5_1_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class City {
    private String name;
    private ArrayList<Way> array = new ArrayList<>();

    public City(String name){
        isNull(name);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWay(City toCity,int price,boolean isReverseWay){
        isNull(toCity);
        if (this == toCity) return;
        if (array != null){
            if (isHaveWay(toCity,price)){
                return;
            }
            else{
                designer(this,toCity,price,isReverseWay);
            }
        }
        else {
            designer(this,toCity,price,isReverseWay);
        }
    }

    private void designer(City fromCity, City toCity, int price,boolean isReverseWay){
        new Way(this, toCity,price);
        if (isReverseWay == true){
            new Way(toCity,this,price);
        }
    }

    void pSetWay(Way way){
        isNull(way);
        array.add(way);
    }

    private boolean isHaveWay(City toCity,int price){
        isNull(toCity);
        for (Way w:array){
            if (w.getToCity().equals(toCity)){
                return true; //
            }
        }
        return false;
    }

    private void isNull(Object val){
        if (val == null) {
            throw new NullPointerException();
        }
    }

    @Override
    public  String toString(){
        String rez = "-----------------------\nCity " + name + ' ';
        if (array != null && array.size() > 0){
            for (int i = 0;i < array.size();i++){
                rez += "\n" + array.get(i);
            }
        }
        else{
            rez += " not have way";
        }
        return rez + "\n-----------------------\n";
    }

    @Override
    public int hashCode(){
        int rez = 0;
        for (Way w:array){
            rez += w.hashCode();
        }
        return rez;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        City c = (City) o;
        if (c.array.size() != array.size()) return false;

        ArrayList<Way> thisArrayList = new ArrayList<>(array);
        ArrayList<Way> oArrayList = new ArrayList<>(c.array);

        for (Way w:thisArrayList) {
            if (!oArrayList.remove(w)) {
                return false;
            }
        }

        return oArrayList.isEmpty();
    }

}


