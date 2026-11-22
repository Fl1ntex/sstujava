package packege3.packege3_2.packege3_2_2;

import packege2.packege2_3.packege2_3_8.Shooting;

public class Pistol extends Weapon implements Shooting {
    private final int maxAmmo;

    public Pistol(){
        this(5);
    }

    public Pistol(int maxAmmo){
        this(maxAmmo,maxAmmo);
    }

    public Pistol(int maxAmmo, int ammo){
        super(ammo);
        if (maxAmmo > 0){
            this.maxAmmo = maxAmmo;
            return;
        }
        throw new IllegalArgumentException();
    }


    @Override
    public int ammo() {
        return ammo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public boolean isFullMagazine(){
        return ammo == maxAmmo;
    }



    @Override
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