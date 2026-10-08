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
                new Way(this, toCity,price);
                if (isReverseWay == true) {
                    new Way(toCity,this,price);
                }
            }
        }
        else {
            new Way(this, toCity,price);
            if (isReverseWay == true){
                new Way(toCity,this,price);
            }
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


//Way w1 = new Way("F",1);
//Way w2 = new Way("B",5);
//Way w3 = new Way("D",6);
//City a = new City("A",w1,w2,w3);
//        System.out.println(a);
//Way w4 = new Way("B",1);
//Way w5 = new Way("E",2);
//City f = new City("F",w4, w5);
//        System.out.println(f);
//Way w6 = new Way("A",5);
//Way w7 = new Way("C",3);
//City b = new City("B",w6, w7);
//        System.out.println(b);
//Way w8 = new Way("F",2);
//City E = new City("E",w8);
//        System.out.println(E);
//Way w9 = new Way("B",3);
//Way w10 = new Way("D",4);
//City C = new City("C",w9, w10);
//        System.out.println(C);
//Way w11 = new Way("C",4);
//Way w12 = new Way("E",2);
//Way w13 = new Way("A",6);
//City D = new City("D",w11,w12,w13);
//        System.out.println(D);