package packege3.packege3_2.packege3_2_1;

public class Employee {

    String name;
    Department otdel;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Department otdel) {
        this.name = name;
        this.otdel = otdel;
        otdel.setNewEmployee(this);
    }

    public String getEmployeeDepartment() {
        return otdel.getEmployee();
    }

    @Override
    public String toString() {
        String rez = name + " ";

        if (otdel != null) {
            rez += "worked in " + otdel.name;

            if (otdel.leader == this) {
                rez += " and leader";
            } else if (otdel.leader != null) {
                rez += " leader to " + otdel.leader.name;
            } else {
                rez += " not have leader";
            }
        }

        return rez;
    }
}