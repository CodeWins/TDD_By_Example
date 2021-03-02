package iva.springframework;

/**
 * Created By iVa on 2/28/2021.
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
       super(amount, currency);
    }



    public Money times(int multiplier) {

        return Money.franc(amount*multiplier);
    }


}
