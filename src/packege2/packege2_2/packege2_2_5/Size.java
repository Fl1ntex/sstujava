package packege2.packege2_2.packege2_2_5;

public class Size implements Characteristic {

    private double size;

    public Size(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "size " + size;
    }
}
