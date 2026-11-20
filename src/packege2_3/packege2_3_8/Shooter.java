package packege2_3.packege2_3_8;

import packege2_1.packege2_1_4.Rifle;
import packege2_2.packege2_2_1.Pistol;

public class Shooter implements Shooting{
    private String name;
    private Shooting pistol;


    public Shooter(String name){
        this.name = name;
    }

    public Shooter(String name, Shooting pistol){
        this.name = name;
        this.pistol = pistol;
    }



    @Override
    public void shoot(){
        if (pistol != null){
            pistol.shoot();
        }
        else{
            System.out.println("не могу участвовать в перестрелке");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setPistol(Pistol pistol) {
        this.pistol = new Pistol(pistol);
    }
}


//Shooting[] sh = new Shooting[]{
//        new Shooter("name1"),
//        new Shooter("name 2",new Pistol()),
//        new Shooter("name 3", new Rifle())
//};
//        for(Shooting s:sh){
//        s.shoot();
//        }