package packege2_2.packege2_2_3;

import java.util.Random;

public class Kykyshka extends Bird{

    public Kykyshka(){
        super("ky-ky");
    }

    @Override
    public void son(){
        Random r = new Random();
        int rez = r.nextInt(10);
        for (int i = 0; i < rez; i++){
            System.out.println(super.getMusic());
        }
    }
}
