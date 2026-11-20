package packege2_2.packege2_2_5;

import java.util.Arrays;

public class Pozition implements Characteristic {

    private int[] coordinates;

    public Pozition(int... coordinates) {
        this.coordinates = Arrays.copyOf(coordinates, coordinates.length);
    }

    @Override
    public String toString() {
        return "koordinatu " + Arrays.toString(coordinates);
    }
}
