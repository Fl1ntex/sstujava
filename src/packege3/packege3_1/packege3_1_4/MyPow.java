package packege3.packege3_1.packege3_1_4;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class MyPow {
    public static double myPow(String x, String y){
        return pow(parseInt(x), parseInt(y));
    }
}


//import static packege3.packege3_1.packege3_1_4.MyPow.myPow;
//System.out.println(myPow(args[0],args[1]));