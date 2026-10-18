package packege1_6.packege1_6_4;

public class Fractions {
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
}
