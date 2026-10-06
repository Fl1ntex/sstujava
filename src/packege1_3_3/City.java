package packege1_3_3;

import java.util.Arrays;

public class City {
    private String name;
    private Way[] array;

    public City(String name,Way... array){
        isNull(name);
        isNull(array);
        isNullElemets(array);
        this.array = Arrays.copyOf(array,array.length);
        this.name = name;
    }



    private void isNull(Object val){
        if (val == null) {
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
    public  String toString(){
        String rez = "-----------------------\nCity " + name + ' ';
        for (int i = 0;i < array.length;i++){
            rez += "\n" + array[i];
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