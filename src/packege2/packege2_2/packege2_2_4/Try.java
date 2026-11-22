package packege2.packege2_2.packege2_2_4;

public class Try implements Figure{
    private int h;
    private int osn;

    public Try(int h, int osn) {
        if (h <= 0 || osn <= 0){
            throw new IllegalArgumentException("not < 0");
        }
        this.h = h;
        this.osn = osn;
    }

    @Override
    public double area() {
        return h * osn / 2.0;
    }
}
