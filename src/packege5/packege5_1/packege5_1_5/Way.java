package packege5.packege5_1.packege5_1_5;

class Way {
    private int price;
    private City toCity;
    private City fromCity;

    public Way(City fromCity, City toCity, int price){
        isNull(fromCity);
        isNull(toCity);
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.price = price;
        fromCity.pSetWay(this);
    }

    public City getFromCity(){
        return fromCity;
    }

    public City getToCity() {
        return toCity;
    }

    public int getPrice() {
        return price;
    }

    private void isNull(Object val){
        if (val == null) {
            throw new NullPointerException();
        }
    }

    @Override
    public String toString(){
        return "Gorod " + toCity.getName() + " stoimost " + price;
    }

    @Override
    public int hashCode(){
        return toCity.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        return toCity == ((Way) o).getToCity();
    }
}



















