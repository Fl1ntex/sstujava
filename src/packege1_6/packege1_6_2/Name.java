package packege1_6.packege1_6_2;

public class Name {
    private String name;
    private String surname;
    private String patronymic;

    public Name(String name){
        this(name,null);
    }
    public Name(String name, String surname){
        this(name,surname,null);
    }
    public Name(String name, String surname, String patronymic){
        isNull(name);
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    private void isNull(Object val){
        if (val == null){
            throw new NullPointerException();
        }
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }



    @Override
    public String toString(){
        if (surname == null && patronymic == null){
            return name;
        }
        else if (patronymic == null){
            return surname + " " + name;
        }
        return surname + " " + name + " " + patronymic;
    }

}