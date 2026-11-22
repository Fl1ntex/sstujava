package packege3.packege3_2.packege3_2_1;

import java.util.Arrays;

public class Department {

    String name;
    Employee[] array;
    Employee leader;

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, Employee leader) {
        this.name = name;
        this.leader = leader;
        leader.otdel = this;
        array = new Employee[]{leader};
    }

    public Department(String name, Employee leader, Employee... array) {
        this.name = name;
        this.leader = leader;

        this.array = Arrays.copyOf(array, array.length + 1);
        this.array[array.length] = leader;

        leader.otdel = this;

        for (Employee e : array) {
            e.otdel = this;
        }
    }

    public void setNewEmployee(Employee e) {
        if (array == null) {
            array = new Employee[]{e};
        } else {
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = e;
        }

        e.otdel = this;
    }

    public void setNewLeader(Employee e) {
        leader = e;
        e.otdel = this;

        if (array == null) {
            array = new Employee[]{e};
        } else {
            for (Employee i : array) {
                if (i == e) {
                    return;
                }
            }
            setNewEmployee(e);
        }
    }

    public String getEmployee() {
        String rez = "";

        if (array != null) {
            for (Employee i : array) {
                rez += i.name + " ";
            }
        }

        return rez;
    }

    @Override
    public String toString() {
        return name + " " + getEmployee();
    }
}