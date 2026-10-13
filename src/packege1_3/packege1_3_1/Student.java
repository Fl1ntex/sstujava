package packege1_3.packege1_3_1;


import java.util.List;

public class Student {
    private String name;
    private List<Integer> array;

    public Student(String name, int... array){

    }

    public Student(String name, List<Integer> array) {
        isNull(name);
        isNull(array);
        isValidNum(array);
        this.name = name;
        this.array = List.copyOf(array);
    }





    @Override
    public String toString(){
       return "";
    }

    private void isNull(Object val){
        if (val == null) {
            throw new NullPointerException();
        }
    }
    private void isValidNum(Integer i){
        if (i < 2 || i > 5){
            throw new IllegalArgumentException("not in range(2,5)");
        }
    }
    private void isValidNum(List<Integer> array){
        for (Integer i:array){
            isValidNum(i);
        }
    }

}

//packege1_3.packege1_3.packege1_3_1.packege1_3_1.Student v = new packege1_3.packege1_3.packege1_3_1.packege1_3_1.Student("Vacu",3,4,5);
//packege1_3.packege1_3.packege1_3_1.packege1_3_1.Student p = new packege1_3.packege1_3.packege1_3_1.packege1_3_1.Student("Petu",v.getArray());
//        System.out.println(v);
//        System.out.println(p);
//        p.replace(5,0);
//        System.out.println(v);
//        System.out.println(p);