package packege6.packege6_1.packege6_1_1;

public class Korobka <T>{
    private T object;

    public Korobka(T object){
        this.object = object;
    }

    public T getField(){
        return object;
    }

    public T returnField(){
        T tmp = object;
        object = null;
        return tmp;
    }


    public void setField(T object){
        if (object == null){
            throw new IllegalArgumentException("korobka pysta");
        }
        this.object = object;
    }

    public boolean isEmpty(){
        return object == null;
    }
}
