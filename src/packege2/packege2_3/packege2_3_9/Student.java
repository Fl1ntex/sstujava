package packege2.packege2_3.packege2_3_9;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Object> array = new ArrayList<>();
    private Rule rule;

    public Student(String name){
        isNull(name);
        this.name = name;
    }

    public Student(String name, Rule rule){
        isNull(name);
        isNull(rule);
        this.name = name;
        this.rule = rule;
    }



    public void add(Object val){
        isNull(val);
        if (rule != null){
            if (rule.rule(val)){
                array.add((Integer) val);
            }
            else{
                throw new IllegalArgumentException();
            }
        }
        else{
            throw new IllegalArgumentException("not have a rule");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Object> getArray(){
        return new ArrayList<Object>(array);
    }

    public void setName(String name) {
        isNull(name);
        this.name = name;
    }





    public void setRule(Rule rule){
        this.rule = rule;
    }


    private void isNull(Object val){
        if (val == null){
            throw new NullPointerException();
        }
    }

    @Override
    public String toString(){
        if (array.isEmpty()) {
            return name + " net ocenok";
        }
        return name + " " + array;
    }
}

//Rule r = new Rule() {
//    @Override
//    public boolean rule(Object obj) {
//        return (Integer)obj <= 5 && (Integer)obj >= 2;
//    }
//};
//Student s = new Student("dwada",r);
//        s.add(5);
//double d = s.avg();
//        System.out.println(s.isBest());