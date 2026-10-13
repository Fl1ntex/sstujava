package packege1_4.packege1_4_4;

public class House {
    private final int n;

    public House(int n){
        if (n <= 0){
            throw new IllegalArgumentException();
        }
        this.n = n;
    }

    @Override
    public String toString(){
        if (n == 1 || (n > 11 && n%10 == 1)){
            return "DOm s " + n + " этажом";
        }
        return "DOm s " + n + " этажами";
    }
}
