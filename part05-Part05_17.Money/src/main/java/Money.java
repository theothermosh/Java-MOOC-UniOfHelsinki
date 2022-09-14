
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }
    
    public boolean lessThan(Money compared) {
        return this.euros < compared.euros ? true : this.euros == compared.euros ? this.cents < compared.cents : false;
    }
    
    public Money minus(Money decreaser) {
        if (this.euros < decreaser.euros) {
            return new Money(0, 0);
        }
        else if (this.cents < decreaser.cents) {
            return new Money(this.euros - decreaser.euros - 1, this.cents + 100 - decreaser.cents);
        } else {
            return new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        }
    }
}
