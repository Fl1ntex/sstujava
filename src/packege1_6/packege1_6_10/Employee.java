package packege1_6.packege1_6_10;

public class Employee {
    private String name;
    private Department otdel;

    public Employee(String name){
        isNull(name);
        this.name = name;
    }
    public Employee(String name, Department otdel){
        isNull(name);
        isNull(otdel);
        this.name = name;
        this.otdel = otdel;
        otdel.setNewEmployee(this);
    }

    public String getName(){
        return name;
    }

    public void setOtdel(Department otdel){
        isNull(otdel);
        this.otdel = otdel;
    }

    private void isNull(Object val){
        if (val == null) {
            throw new NullPointerException();
        }
    }

    public String getEmployeeDepartment(){
        return otdel.getEmployee();
    }

    @Override
    public String toString(){
        String rez = name + " ";
        if (otdel != null){
            rez += "worked in " + otdel.getName();
            if (otdel.getLeader() != null){
                if (otdel.getLeader() != this){
                    rez += " leager to " + otdel.getLeader().getName();
                }
                else{
                    rez += " and leader";
                }
            }
            else{
                rez += " not have leader";
            }
        }
        return rez;
    }
}
