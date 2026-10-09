package packege1_5.packege1_5_2;

public abstract class Animal {
    protected String name;

    protected Animal(String name){
        isNull(name);
        this.name = name;
    }

    public void golos(){}
    public void golos(int n){}

    @Override
    public String toString(){
        return getClass().getSimpleName() + " " + name;
    }

    protected void isNull(Object val){
        if (val == null){
            throw new NullPointerException();
        }
    }
}
