package packege1_4.packege1_4_7;

import java.util.ArrayList;
import java.util.Arrays;

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


    public void setName(String name) {
        isNull(name);
        this.name = name;
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

