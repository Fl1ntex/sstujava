package packege4.packege4_1.packege4_1_1;

import java.util.ArrayList;

public class Student <T> {
    private String name;
    private ArrayList<T> array = new ArrayList<>();
    private Rule rule;

    public Student(String name){
        this.name = name;
    }

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
}

