import packege1_4.packege1_4_7.*;

public class Main {
    public static void main(String[] args){
        Rule rul = new Rule() {
            @Override
            public boolean rule(Object obj) {
                return (Integer) obj <= 5 && (Integer) obj >= 2;
            }
        };
        Student st = new Student("petu",rul,2,2,5);
        System.out.println(st);
    }
}
