package packege1_3_3;

import java.util.Arrays;

public class City {
    private String name;
    private Way[] array;

    public City(String name){
        isNull(name);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWay(City toCity,int price,boolean isReverseWay){
        isNull(toCity);
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
        if (this.array == null){
            this.array = new Way[]{way};
        }
        else{
            array = Arrays.copyOf(array,array.length + 1);
            array[array.length - 1] = way;
        }
    }

    private boolean isHaveWay(City toCity,int price){
        isNull(toCity);
        for (Way w:array){
            if (this == w.getFromCity()){
                if (toCity == w.getToCity()){
                    if (price == w.getPrice()){
                        return true;
                    }
                }
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
        if (array != null && array.length > 0){
            for (int i = 0;i < array.length;i++){
                rez += "\n" + array[i];
            }
        }
        else{
            rez += " not have way";
        }
        return rez + "\n-----------------------\n";
    }
}


//        City a1 = new City("A");
//        City a2 = new City("A");
//        City b = new City("B");
//        City f = new City("F");
//        City e = new City("E");
//        City d = new City("D");
//        City c = new City("C");
//
//        a1.setWay(b,5,true);
//        a1.setWay(f,1,false);
//        a1.setWay(d,6,true);
//
//        b.setWay(c,3,true);
//
//        f.setWay(b,1,false);
//        f.setWay(e,2,true);
//
//        c.setWay(d,4,true);
//
//
//        a1.setWay(b,5,true); //
//        b.setWay(a2,5,true); //
//
//
//        System.out.println(a1);
//        System.out.println(b);
//        System.out.println(f);
//        System.out.println(e);
//        System.out.println(c);
//        System.out.println(d);