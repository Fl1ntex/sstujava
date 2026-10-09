package packege1_5.packege1_5_1;

public class Pistol {
    private int ammo;

    public Pistol(){
        this(5);
    }

    public Pistol(int ammo){
        this.ammo = ammo;
    }

    public void shoot(){
        if (ammo > 0){
            System.out.println("BAX");
            ammo--;
        }
        else {
            System.out.println("KLAC");
        }
    }

}
