package packege1_3.packege1_3_4;

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
        this.setNewLeader(leader);
    }

    public Department(String name,Employee leader,Employee... array ){
        isNull(name);
        isNull(array);
        isNull(leader);
        isNullElemets(array);
        this.name = name;
        this.array = Arrays.copyOf(array,array.length);
        this.leader = leader;
        this.setNewLeader(leader);
        for (Employee e:array){
            e.setOtdel(this);
        }
    }

    public void setNewEmployee(Employee e){
        if (array != null){
            array = Arrays.copyOf(array,array.length + 1);
            array[array.length - 1] = e;
        }
        else{
            array = new Employee[]{e};
        }
    }

    public void setNewLeader(Employee e){
        isNull(e);
        this.leader = e;
        e.setOtdel(this);
        if (array != null){
            for (Employee i:array){
                if (i == e){
                    return;
                }
            }

            setNewEmployee(e);
        }
        else{
            array = new Employee[]{e};
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

    public String getEmployee(){
        String rez = "";
        if (array != null){
            for (Employee i:array){
                rez += i.getName() + ' ';
            }
        }
        return rez;
    }

    @Override
    public String toString(){
        String rez = name + ' ';
        rez += getEmployee();
        return rez;
    }
}

//Employee e1 = new Employee("petrov");
//Employee e2 = new Employee("kozlov");
//Employee e3 = new Employee("sidorov");
//
//Department d = new Department("IT", e1, e2, e3);
//
//
//        System.out.println(d);
//
//        System.out.println(e1);
//        System.out.println(e2);
//        System.out.println(e3);

//Employee e1 = new Employee("petrov");
//Employee e2 = new Employee("kozlov");
//Employee e3 = new Employee("sidorov");
//
//Department d = new Department("IT", e1, e2, e3);
//
//System.out.println(e2.getEmployeeDepartment());