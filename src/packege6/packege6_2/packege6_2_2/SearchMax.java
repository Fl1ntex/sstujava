package packege6.packege6_2.packege6_2_2;

import packege6.packege6_1.packege6_1_1.Korobka;

public class SearchMax {
    public static <T extends Number> double searchMax(Korobka<T>[] array) {
        double max = array[0].getField().doubleValue();
        double[] arr = new double[array.length];
        for (Korobka<T> t:array){
            if (t.getField().doubleValue() > max){
                max = t.getField().doubleValue();
            }
        }
        return max;
    }
}
