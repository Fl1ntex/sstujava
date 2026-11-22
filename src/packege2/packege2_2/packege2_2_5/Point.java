package packege2.packege2_2.packege2_2_5;

import java.util.ArrayList;

public class Point {

    private ArrayList<Characteristic> characteristics = new ArrayList<>();

    public void addCharacteristic(Characteristic characteristic) {
        characteristics.add(characteristic);
    }

    public void removeCharacteristic(Characteristic characteristic) {
        characteristics.remove(characteristic);
    }

    public void soutCharacteristics() {
        System.out.println("xaracteristiki ");

        for (Characteristic characteristic : characteristics) {
            System.out.println(characteristic);
        }
    }
}

//
//Point point1 = new Point();
//
//        point1.addCharacteristic(new Pozition(3));
//        point1.addCharacteristic(new Color("red"));
//
//Point point2 = new Point();
//
//        point2.addCharacteristic(new Pozition(4, 2, 5));
//        point2.addCharacteristic(new Size(20));
//
//Point point3 = new Point();
//
//        point3.addCharacteristic(new Pozition(7, 7));
//        point3.addCharacteristic(new Color("yellow"));
//        point3.addCharacteristic(new Border("red"));
//        point3.addCharacteristic(new FOrm("cat"));
//
//
//        point1.soutCharacteristics();
//        System.out.println();
//        point2.soutCharacteristics();
//        System.out.println();
//        point3.soutCharacteristics();