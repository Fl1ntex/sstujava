package packege2.packege2_2.packege2_2_3;

public class Vorobeu extends Bird{

    public Vorobeu(){
        super("chirick");
    }

    @Override
    public void son() {
        System.out.println(super.getMusic());
    }
}
