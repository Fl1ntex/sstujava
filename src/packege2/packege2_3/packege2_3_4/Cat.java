package packege2.packege2_3.packege2_3_4;

import packege1.packege1_5.packege1_5_2.Animal;

public class Cat extends Animal implements Meowable{
    public Cat(String name) {
        super(name);
    }


    public void meow(){
        System.out.println(name + " muy");
    }
    @Override
    public void golos(int n){
        while (n-- > 0){
            System.out.println(name + " muy");
        }
    }

}


//Cat c = new Cat("Dwadad");
//
//InitMeowable i = new InitMeowable() {};
//        i.initMeow(c);