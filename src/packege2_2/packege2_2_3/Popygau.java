package packege2_2.packege2_2_3;

import java.util.Random;

public class Popygau extends Bird {

    public Popygau(String music){
        super(music);
    }

    @Override
    public void son(){
        Random r = new Random();
        int rez = r.nextInt(super.getMusic().length());
        for (int i = 0; i < rez ; i++){
            System.out.print(super.getMusic().charAt(i));
        }
        System.out.println();
    }
}
