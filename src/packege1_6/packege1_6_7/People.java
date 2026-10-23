package packege1_6.packege1_6_7;

import packege1_4.packege1_4_5.Name;

public class People {
    private Name name;
    private final People father;

    public People(People people){
        this.name = people.getName();
        this.father = people.getFather();
    }

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


    public Name getName() {
        return name;
    }

    public People getFather() {
        return new People(father);
    }

    @Override
    public String toString() {
        String rez = "Человек с именем: ";

        if (name.getSurname() == null) {
            if (father != null && father.getName().getSurname() != null) {
                rez += father.getName().getSurname();
            }
        }
        else {
            rez += name.getSurname();
        }

        rez += " " + name.getName();

        if (name.getPatronymic() == null) {
            if (father != null && father.getName().getName() != null) {
                rez += " " + father.getName().getName() + "ович";
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