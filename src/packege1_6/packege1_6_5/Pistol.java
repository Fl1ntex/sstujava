package packege1_6.packege1_6_5;

public class Pistol {
    private final int maxAmmo;
    private int ammo;

    public Pistol(){
        this(5);
    }

    public Pistol(int maxAmmo){
        this(maxAmmo,maxAmmo);
    }

    public Pistol(int maxAmmo, int ammo){
        if (maxAmmo > 0 && ammo >= 0){
            if (maxAmmo >= ammo){
                this.ammo = ammo;
                this.maxAmmo = maxAmmo;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public int getAmmo() {
        return ammo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public boolean isFullMagazine(){
        return ammo == maxAmmo;
    }

    public int reload(int newAmmo){
        if (newAmmo <= 0){
            throw new IllegalArgumentException();
        }
        int rezAmmo = ammo + newAmmo;
        if (rezAmmo > maxAmmo){
            ammo = maxAmmo;
            return rezAmmo - maxAmmo;
        }
        ammo = rezAmmo;
        return 0;
    }

    public int toDisinfect(){
        int temp = ammo;
        ammo = 0;
        return temp;
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
