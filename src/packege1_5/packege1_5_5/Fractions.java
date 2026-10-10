package packege1_5.packege1_5_5;

public class Fractions {
    private int numerator; // числитель
    private int denominator; // знаменатель

    public Fractions(int numerator,int denominator){
        if (denominator == 0){
            throw new IllegalArgumentException();
        }
        else{
            this.denominator = denominator;
            this.numerator = numerator;
        }
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }


    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
}
