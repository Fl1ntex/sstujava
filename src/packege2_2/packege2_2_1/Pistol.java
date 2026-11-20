package packege2_2.packege2_2_1;

import packege2_3.packege2_3_8.Shooting;

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

    public Pistol(Pistol pistol){
        super(pistol.ammo());
        this.maxAmmo = getMaxAmmo();
    }

    @Override
    public int ammo() {
        return super.ammo();
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public boolean isFullMagazine(){
        return super.ammo() == maxAmmo;
    }



    @Override
    public void shoot(){
        if (super.ammo() > 0){
            System.out.println("BAX");
            super.getAmmo();
        }
        else {
            System.out.println("KLAC");
        }
    }

}