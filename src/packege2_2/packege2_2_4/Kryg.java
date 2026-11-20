package packege2_2.packege2_2_4;

public class Kryg implements Figure{
    private int radiys;

    public Kryg(int radiys){
        if (radiys <= 0){
            throw new IllegalArgumentException("not < 0");
        }
        this.radiys = radiys;
    }

    @Override
    public double area(){
        return radiys * Math.PI * radiys;
    }
}
