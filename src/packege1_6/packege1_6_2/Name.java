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
        int cnt = 0;
        if (name.isBlank()) cnt++;
        if (surname.isBlank()) cnt++;
        if (patronymic.isBlank()) cnt++;
        if (cnt == 0){
            throw new NullPointerException();
        }
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
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
        String rez = "";
        if (name.isBlank()) rez += name;
        if (surname.isBlank()) rez += " " + surname;
        if (patronymic.isBlank()) rez += " " + patronymic;
        return rez;
    }

}