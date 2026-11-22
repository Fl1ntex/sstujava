package packege2.packege2_2.packege2_2_5;

public class Color implements Characteristic {

    private String color;

    public Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "color " + color;
    }
}
