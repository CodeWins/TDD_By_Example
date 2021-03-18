package iva.springframework;

import org.w3c.dom.html.HTMLImageElement;



/**
 * Created By iVa on 3/1/2021.
 */
public  class Money implements Expression {
    protected int amount;
    protected String currency;




    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && this.currency == money.currency;
    }


    protected String currency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public  Money times(int multiplier) {

        return new Money(amount * multiplier,   this.currency);
    }

    public Expression plus(Money add) {

        return new Money(amount + add.amount,   currency);
    }
}

