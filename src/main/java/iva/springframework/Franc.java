package iva.springframework;

/**
 * Created By iVa on 2/28/2021.
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {

        return new Franc(amount*multiplier);
    }


}
