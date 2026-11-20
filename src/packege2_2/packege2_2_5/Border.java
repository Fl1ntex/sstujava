package packege2_2.packege2_2_5;

public class Border implements Characteristic {

    private String color;

    public Border(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "obvodka " + color;
    }
}

