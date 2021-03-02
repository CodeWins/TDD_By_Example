package iva.springframework;

import org.w3c.dom.html.HTMLImageElement;

/**
 * Created By iVa on 3/1/2021.
 */
public abstract class Money {
    protected int amount;
    protected String currency;


    public abstract Money times(int multiplier);

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(object.getClass());
    }


    protected String currency() {
        return currency;
    }
}

