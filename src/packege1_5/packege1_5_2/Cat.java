package packege1_5.packege1_5_2;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void golos(){
        System.out.println(name + " muy");
    }
    @Override
    public void golos(int n){
        while (n-- > 0){
            System.out.println(name + " muy");
        }
    }

}
