package packege1_5.packege1_5_6;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> array = new ArrayList<>();

    public Student(String name){
        isNull(name);
        this.name = name;
    }

    public Student(String name, int... array) {
        isNull(name);
        isNull(array);
        validNumbers(array);
        this.name = name;
        for (int n:array){
            this.array.add(n);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        isNull(name);
        this.name = name;
    }

    public ArrayList<Integer> getArray() {
        return new ArrayList<>(array);
    }

    public void addNumber(int n){
        validNumber(n);
        array.add(n);
    }

    public double avg(){
        double rez = 0;
        for (int i:array){
            rez += i;
        }
        return rez / array.size();
    }

    public boolean isBest(){
        if (array.size() > 0){
            for (int i:array){
                if (i != 5){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private void isNull(Object val){
        if (val == null) {
            throw new NullPointerException();
        }
    }

    private void validNumbers(int[] array){
        for (int n:array){
            validNumber(n);
        }
    }

    private void validNumber(int n){
        if (n < 2 || n >5){
            throw new IllegalArgumentException("ocenka in [2-5]");
        }
    }

    @Override
    public String toString(){
        if (array == null){
            return name + " net ocenok";
        }
        return name + " " + array;
    }
}

