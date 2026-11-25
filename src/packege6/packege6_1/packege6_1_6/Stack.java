package packege6.packege6_1.packege6_1_6;

import java.util.ArrayList;
import java.util.List;

public class Stack <T>{
    private List<T> array = new ArrayList<>();

    public void push(T value){
        array.add(value);
    }

    public T pop(){
        isEmpty();
        T val =  array.get(array.size() - 1);
        array.remove(array.size() - 1);
        return val;
    }

    public T peek(){
        isEmpty();
        return array.get(array.size() - 1);
    }

    private void isEmpty(){
        if (array.size() < 1){
            throw new IllegalArgumentException("stack clear");
        }
    }
}
