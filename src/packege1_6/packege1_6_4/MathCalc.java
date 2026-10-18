package packege1_6.packege1_6_4;

public class MathCalc {
    private MathCalc(){

    }

    public static Fractions sum(Fractions a, int b){
        return sum(a,new Fractions(b,1));
    }
    public static Fractions sum(Fractions a, Fractions b) {
        int nokAB = nok(a.getDenominator(), b.getDenominator());

        int newANumerator = (nokAB / a.getDenominator()) * a.getNumerator();
        int newBNumerator = (nokAB / b.getDenominator()) * b.getNumerator();

        newANumerator *= signChange(a);
        newBNumerator *= signChange(b);

        return reduce(new Fractions(newANumerator + newBNumerator, nokAB));
    }

    public static Fractions minus(Fractions a, int b){
        return minus(a,new Fractions(b,1));
    }
    public static Fractions minus(Fractions a, Fractions b){
        int nokAB = nok(a.getDenominator(), b.getDenominator());

        int newANumerator = (nokAB / a.getDenominator()) * a.getNumerator();
        int newBNumerator = (nokAB / b.getDenominator()) * b.getNumerator();

        newANumerator *= signChange(a);
        newBNumerator *= signChange(b);

        return reduce(new Fractions(newANumerator - newBNumerator, nokAB));
    }

    public static Fractions multiplication(Fractions a, int b){
        return multiplication(a,new Fractions(b,1));
    }
    public static Fractions multiplication(Fractions a, Fractions b){
        Fractions f = new Fractions(a.getNumerator() * b.getNumerator(),a.getDenominator() * b.getDenominator());
        if ((a.getIsMoreNull() && b.getIsMoreNull()) || (!a.getIsMoreNull() && !b.getIsMoreNull())){
            f.setIsMoreNull(true);
        }
        else{
            f.setIsMoreNull(false);
        }
        return reduce(f);
    }

    public static Fractions division(Fractions a, int b){
        return division(a,new Fractions(b,1));
    }
    public static Fractions division(Fractions a, Fractions b){
        if (b.getNumerator() == 0){
            throw new ArithmeticException();
        }
        Fractions f = new Fractions(b.getDenominator(), b.getNumerator());
        f.setIsMoreNull(b.getIsMoreNull());
        return multiplication(a, f);
    }



    private static int signChange(Fractions a) { // смена знака
        if (a.getIsMoreNull() == false){
            return -1;
        }
        return 1;
    }

    private static int nok(int a,int b){
        int reza = a;
        int rezb = b;
        while (reza != rezb){
            if (reza < rezb){
                reza += a;
            }
            else{
                rezb += b;
            }
        }
        return reza;
    }

    private static Fractions reduce(Fractions fractions){ // сокращение
        int thisnod = nod(fractions.getDenominator(), fractions.getNumerator());
        return new Fractions(fractions.getNumerator() /  thisnod,fractions.getDenominator() /  thisnod);
    }

    private static int nod(int a, int b){
        if (a == 0 || b == 0){
            return 1;
        }
        int max,min;
        if (a > b){
            return helpnod(a,b);
        }
        else if (a == b){
            return a;
        }
        else {
            return helpnod(b,a);
        }
    }

    private static int helpnod(int max,int min){
        int rez = max % min;
        if (rez == 0){
            return min;
        }
        return helpnod(min,rez);
    }
}
