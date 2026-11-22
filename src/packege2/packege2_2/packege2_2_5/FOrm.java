package packege2.packege2_2.packege2_2_5;

public class FOrm implements Characteristic {

    private String shape;

    public FOrm(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "forma " + shape;
    }
}
