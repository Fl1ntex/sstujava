package packege5.packege5_1.packege5_1_6;

import java.util.ArrayList;

public class Student <T> {
    private String name;
    private ArrayList<T> array = new ArrayList<>();
    private Rule rule;


    public Student(String name, Rule rule){
        this.name = name;
        this.rule = rule;
    }


    public void add(T val){
        if (rule != null){
            if (rule.rule(val)){
                array.add(val);
            }
            else{
                throw new IncorrectAssessment();
            }
        }
        else{
            throw new NotHaveRule("not have a rule");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getArray(){
        return new ArrayList<T>(array);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRule(Rule rule){
        this.rule = rule;
    }


    @Override
    public String toString(){
        if (array.isEmpty()) {
            return name + " net ocenok";
        }
        return name + " " + array;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Student s = (Student) o;
        if (s.name.equals(name)){
             return s.rule.avg(s) == this.rule.avg(this);
        }
        return false;
    }
}



//Rule r = new Rule() {
//    @Override
//    public boolean rule(Object obj){
//        return (int) obj >= 2 && (int) obj <= 5;
//    }
//
//    @Override
//    public double avg(Object obj) {
//        int rez = 0;
//        for (Object i:((Student)obj).getArray()){
//            rez += (int) i;
//        }
//        return rez / (double)((Student)obj).getArray().size();
//    }
//};
//
//Student<Integer> st = new Student<>("Dawd",r);
//Student<Integer> st2 = new Student<>("Dawd",r);
//
//        st.add(2);
//        st.add(2);
//        st.add(5);
//
//        st2.add(3);
//        st2.add(3);
//        st2.add(3);
//        System.out.println(st.equals(st2));





