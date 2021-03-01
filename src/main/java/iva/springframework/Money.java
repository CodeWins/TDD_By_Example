package iva.springframework;

/**
 * Created By iVa on 3/1/2021.
 */
public class Money {
    protected int amount;

    public boolean equals(Object object){
        Money money = (Money)object;
        return amount == money.amount;
    }
}

