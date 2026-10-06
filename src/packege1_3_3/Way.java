package packege1_3_3;

public class Way {
    private int price;
    private String toCity;

    public Way(String city,int price){
        isNull(city);
        this.toCity = city;
        this.price = price;
    }

    private void isNull(Object val){
        if (val == null) {
            throw new NullPointerException();
        }
    }

    @Override
    public String toString(){
        return "Gorod " + toCity + " stoimost " + price;
    }
}