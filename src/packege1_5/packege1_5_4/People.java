package packege1_5.packege1_5_4;

import packege1_4.packege1_4_5.Name;

public class People {
    private Name name;
    private People father;

    public People(Name name, People father) {
        isNull(name);
        this.name = name;
        this.father = father;
    }

    public People(String name) {
        this(new Name(name), (People) null);
        // this(new Name(name), null);
    }

    public People(Name name) {
        this(name, (People) null);
    }

    public People(String fatherName, String name) {
        this(new Name(name), new People(fatherName));
    }

    public People(Name father, Name name) {
        this(name, new People(father));
    }

    public void setFather(People father) {
        isNull(father);
        this.father = father;
    }

    public String getName() {
        return name.getName();
    }


    public String getPatronymic(){
        if (name.getPatronymic() != null){
            return name.getPatronymic();
        }
        else {
            if (father != null){
                return father.getName() + "вич";
            }
            else{
                return "not have a Patronymic";
            }
        }
    }

    public People getFather() {
        return father;
    }

    public Name getFullName() {
        return name;
    }

    @Override
    public String toString() {
        String rez = "Человек с именем: ";

        if (name.getSurname() == null) {
            if (father != null && father.getFullName().getSurname() != null) {
                rez += getFullName().getSurname();
            }
        }
        else {
            rez += name.getSurname();
        }

        rez += " " + name.getName();

        if (name.getPatronymic() == null) {
            if (father != null && father.getFullName().getName() != null) {
                rez += " " + father.getFullName().getName() + "ович";
            }
        }
        return rez;
    }

    private void isNull(Object val) {
        if (val == null) {
            throw new NullPointerException();
        }
    }
}


//Name n1 = new Name("nickita","syirshov");
//Name n2 = new Name("sergey");
//People p2 = new People(n2);
//People p1 = new People(n1,p2);
//        System.out.println(p1);