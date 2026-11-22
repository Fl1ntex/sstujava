package packege2.packege2_2.packege2_2_4;

public class Squre implements Figure{
    private int storona;

    public Squre(int storona){
        if (storona <= 0){
            throw new IllegalArgumentException("not < 0");
        }
        this.storona = storona;
    }

    @Override
    public double area(){
        return storona * storona;
    }
}
