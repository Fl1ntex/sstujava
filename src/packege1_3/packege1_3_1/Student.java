package packege1_3.packege1_3_1;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] array;

    public Student(String name, int... array) {
        isNull(name);
        isNull(array);
        validNumbers(array);
        this.name = name;
        this.array = Arrays.copyOf(array,array.length);
    }

    public void add(int n){
        validNumber(n);
        array = Arrays.copyOf(array,array.length + 1);
        array[array.length - 1] = n;
    }

    public void replace(int n,int ind){
        validNumber(n);
        validIndex(ind);
        array[ind] = n;
    }

    public String getName() {
        return name;
    }

    public int[] getArray() {
        return Arrays.copyOf(array,array.length);
    }

    public void setName(String name) {
        isNull(name);
        this.name = name;
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

    private void validIndex(int ind){
        if (ind < 0 || ind >= array.length){
            throw new ArrayIndexOutOfBoundsException(ind);
        }
    }

    @Override
    public String toString(){
        if (array == null){
            return name + " net ocenok";
        }
        return name + " " + Arrays.toString(array);
    }

}

//packege1_3.packege1_3.packege1_3_1.packege1_3_1.Student v = new packege1_3.packege1_3.packege1_3_1.packege1_3_1.Student("Vacu",3,4,5);
//packege1_3.packege1_3.packege1_3_1.packege1_3_1.Student p = new packege1_3.packege1_3.packege1_3_1.packege1_3_1.Student("Petu",v.getArray());
//        System.out.println(v);
//        System.out.println(p);
//        p.replace(5,0);
//        System.out.println(v);
//        System.out.println(p);