package iva.springframework;

/**
 * Created By iVa on 2/28/2021.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {

        return new Dollar(amount * multiplier);
    }
}

