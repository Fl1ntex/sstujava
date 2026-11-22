package packege2.packege2_1.packege2_1_4;

import packege1.packege1_6.packege1_6_5.Pistol;
import packege2.packege2_3.packege2_3_8.Shooting;

public class Rifle extends Pistol implements Shooting{
    private final int rateFire;

    public Rifle(){
        super(30,30);
        rateFire = 30;
    }

    public Rifle(int maxAmmo){
        super(maxAmmo);
        normalRateFire(maxAmmo);
        rateFire = maxAmmo / 2;
    }

    public Rifle(int maxAmmo, int rateFire){
        super(maxAmmo);
        normalRateFire(rateFire);
        this.rateFire = rateFire;
    }

    @Override
    public void shoot(){
        for (int i = 0; i < rateFire; i++){
            super.shoot();
        }
    }

    public void shoot(int n){
        for (int j = 0; j < n; j++){
            for (int i = 0; i < rateFire; i++) {
                super.shoot();
            }
        }
    }



    private void normalRateFire(int ammo){
        if (ammo <= 0){
            throw new IllegalArgumentException("ammo > 0");
        }
    }
}
