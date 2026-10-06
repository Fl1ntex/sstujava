package packege1_3_4;

import java.util.Arrays;

public class Department {
    private String name;
    private Employee[] array;
    private Employee leader;

    public Department(String name){
        isNull(name);
        this.name = name;
    }

    public Department(String name,Employee leader){
        isNull(name);
        isNull(leader);
        this.name = name;
        this.leader = leader;
    }

    public Department(String name,Employee leader,Employee... array ){
        isNull(name);
        isNull(array);
        isNull(leader);
        isNullElemets(array);
        this.name = name;
        this.array = Arrays.copyOf(array,array.length);
        this.leader = leader;
    }

    public void setNewEmployee(Employee e){
        if (array != null){
            array = Arrays.copyOf(array,array.length + 1);
            array[array.length - 1] = e;
        }
    }

    public Employee getLeader(){
        return leader;
    }
    public String getName(){
        return name;
    }

    private void isNull(Object val){
        if (val == null) {
            throw new NullPointerException();
        }
    }
    private void isNullElemets(Object[] val){
        isNull(val);
        for (Object o:val){
            isNull(o);
        }
    }
}



//Department d = new Department("IT");
//
//Employee e1 = new Employee("petrov",d);
//Employee e2 = new Employee("kozlov",d);
//Employee e3 = new Employee("sidorov",d);
//
//
//        System.out.println(e1);
//        System.out.println(e2);
//        System.out.println(e3);