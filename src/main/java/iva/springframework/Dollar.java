package iva.springframework;

/**
 * Created By iVa on 2/28/2021.
 */
public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {

        return new Dollar(amount*multiplier);
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar)object;
        return amount == dollar.amount;
    }
}
