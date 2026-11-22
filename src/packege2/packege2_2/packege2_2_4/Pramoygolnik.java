package packege2.packege2_2.packege2_2_4;

public class Pramoygolnik implements Figure {
    private int longer;
    private int shirina;

    public Pramoygolnik(int longer, int shirina) {
        if (longer <= 0 || shirina <= 0){
            throw new IllegalArgumentException("not < 0");
        }
        this.longer = longer;
        this.shirina = shirina;
    }

    @Override
    public double area(){
        return longer * shirina;
    }
}
