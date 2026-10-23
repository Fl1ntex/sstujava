package packege1_6.packege1_6_8;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> array = new ArrayList<>();
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

    public Student(String name, Rule ruleObj, int... array) {
        isNull(name);
        isNull(ruleObj);
        isNull(array);
        this.name = name;
        this.rule = ruleObj;
        for (int i:array){
            if (!ruleObj.rule(i)){
                throw new IllegalArgumentException();
            }
            this.array.add(i);
        }
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

    public ArrayList<Integer> getArray(){
        return new ArrayList<Integer>(array);
    }

    public void setName(String name) {
        isNull(name);
        this.name = name;
    }

    public double avg(){
        if (array.isEmpty()){
            return 0;
        }

        double rez = 0;
        for (int i : array){
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