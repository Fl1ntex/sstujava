package packege4.packege4_2.packege4_2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSumBilder {
    public static ArrayList<Double> sum(String[] args){
        Double rez = null;
        int ind = 0;

        while(rez == null && ind < args.length){
            try {
                rez = Double.parseDouble(args[ind++].trim());
            } catch (NumberFormatException _) {}
        }

        ArrayList<Double> array = new ArrayList<Double>();

        if (rez == null) {
            return array;
        }

        for (int i = ind; i < args.length; i++){
            try {
                array.add(rez / Double.parseDouble(args[i].trim()));
            } catch (NumberFormatException _) {}
        }

        return array;
    }
}


//String[] str = {"abc", "100", "hello", "2", "5"};
//        System.out.println(StringSumBilder.sum(str));