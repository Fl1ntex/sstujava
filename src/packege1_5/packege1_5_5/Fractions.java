package packege1_5.packege1_5_5;

public class Fractions {
    private int numerator; // числитель
    private int denominator; // знаменатель
    private boolean isMoreNull;

    public Fractions(int numerator,int denominator){
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

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setIsMoreNull(boolean isMoreNull){
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
}
