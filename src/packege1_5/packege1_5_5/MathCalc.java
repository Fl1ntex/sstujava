package packege1_5.packege1_5_5;

public class MathCalc {
    private MathCalc(){

    }

    public static Fractions sum(Fractions a, Fractions b) {
        int nokAB = nok(a.getDenominator(), b.getDenominator());

        int newANumerator = (nokAB / a.getDenominator()) * a.getNumerator();
        int newBNumerator = (nokAB / b.getDenominator()) * b.getNumerator();

        return reduce(new Fractions(newANumerator + newBNumerator, nokAB));
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

    private static Fractions reduce(Fractions fractions){
        int thisnod = nod(fractions.getDenominator(), fractions.getNumerator());
        fractions.setNumerator(fractions.getNumerator() /  thisnod);
        fractions.setDenominator(fractions.getDenominator() /  thisnod);
        return fractions;
    }

    private static int nod(int a, int b){
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
