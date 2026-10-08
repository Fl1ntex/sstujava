package packege1_4.packege1_4_6;

import packege1_4.packege1_4_5.Name;

public class People {
    private Name name;
    private People father;

    public People(String name){
        this(new Name(name));
    }

    public People(String fatherName, String name){
        isNull(fatherName);
        isNull(name);
        this.father = new People(fatherName);
        this.name = new Name(name);
    }

    public People(Name father, Name name){
        isNull(father);
        isNull(name);
        this.name = name;
        this.father = new People(father);
    }

    public People(Name name, People dady){
        isNull(name);
        isNull(dady);
        this.name = name;
        this.father = dady;
    }

    public People(Name name){
        isNull(name);
        this.name = name;
    }


    public void setFather(People father){
        isNull(father);
        this.father = father;
    }

    public Name getName(){
        return name;
    }
    public People getFather(){
        return father;
    }

    @Override
    public String toString(){
        String rez = "Человек с именем: ";
        if (name.getSurname() == null){
            if (father != null){
                if (father.getName().getSurname() != null){
                    rez += father.getName().getSurname();
                }
            }
        }
        else {
            rez += name.getSurname();
        }
        rez += " " + name.getName();
        if (name.getPatronymic() == null){
            if (father != null){
                if (father.getName().getName() != null){
                    rez +=  " " + father.getName().getName() + "ович";
                }
            }
        }

        return rez;
    }
    private void isNull(Object val){
        if (val == null){
            throw new NullPointerException();
        }
    }
}
