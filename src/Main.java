import packege5.packege5_1.packege5_1_6.Rule;
import packege5.packege5_1.packege5_1_6.Student;

public class Main {
    public static void main(String[] args)  {
        Rule r = new Rule() {
            @Override
            public boolean rule(Object obj){
                return (int) obj >= 2 && (int) obj <= 5;
            }

            @Override
            public double avg(Object obj) {
                int rez = 0;
                for (Object i:((Student)obj).getArray()){
                    rez += (int) i;
                }
                return rez / (double)((Student)obj).getArray().size();
            }
        };

        Student<Integer> st = new Student<>("Dawd",r);
        Student<Integer> st2 = new Student<>("Dawd",r);

        st.add(2);
        st.add(2);
        st.add(5);

        st2.add(3);
        st2.add(3);
        st2.add(3);
        System.out.println(st.equals(st2));
    }
}