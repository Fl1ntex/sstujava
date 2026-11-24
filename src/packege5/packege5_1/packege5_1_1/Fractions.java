package packege5.packege5_1.packege5_1_1;

public class Fractions extends Number {
    final private int numerator; // числитель
    final private int denominator; // знаменатель
    private boolean isMoreNull;

    public Fractions(int numerator, int denominator){
        if (denominator == 0){
            throw new IllegalArgumentException();
        }
        else{
            this.denominator = Math.abs(denominator);
            this.numerator = Math.abs(numerator);
            if (numerator == 0){
                isMoreNull = true;
                return;
            }
            if (numerator > 0){
                if (denominator > 0){
                    isMoreNull = true;
                }
                else {
                    isMoreNull = false;
                }
            }
            else{
                if (denominator > 0){
                    isMoreNull = false;
                }
                else {
                    isMoreNull = true;
                }
            }
        }
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean getIsMoreNull(){
        return isMoreNull;
    }



    void setIsMoreNull(boolean isMoreNull){
        this.isMoreNull = isMoreNull;
    }


    @Override
    public String toString(){
        String rez = "";
        if (numerator == 0){
            return "0";
        }
        if (isMoreNull == false){
            rez += "-";
        }
        return rez + numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public int hashCode(){
        return numerator + denominator;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Fractions f = (Fractions)o;
        if (f.getDenominator() == denominator){
            if (f.getNumerator() == numerator){
                return true;
            }
        }
        return false;
    }
}
