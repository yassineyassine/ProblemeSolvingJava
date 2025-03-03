// Online Java Compiler
// Use this editor to write, compile and run your Java code online




//It looks like the task involves implementing a function in Java to optimally return change using 2€, 5€, and 10€ denominations.
/*We need to return an amount of money (S) using the fewest coins and bills.
Available denominations: 2€, 5€, and 10€.
Some amounts cannot be formed (e.g., 1€, 3€).
The result should be an object Change with:
coins: Number of 2€ coins.
bills5: Number of 5€ bills.
bills10: Number of 10€ bills. */

class Change {
    long coins;  // Number of 2€ coins
    long bills5; // Number of 5€ bills
    long bills10; // Number of 10€ bills

    
}

class optimallyChange {
    static Change optimalChange(long s) {

        Change ch=new Change();
        ch.coins=0;
            ch.bills5=0;
            ch.bills10=0;

        if (s < 2 || s == 3) {
            

            return null; // Impossible cases
        }

        long bills10 = s / 10;
        long remainder = s % 10;

        long bills5 = 0;
        long coins = 0;

        if (remainder == 1 || remainder == 3) {
            if (bills10 > 0) {
                bills10--; // Reduce one 10€ bill
                remainder += 10;
            } else {
                return ch; // Impossible case
            }
        }

        if (remainder >= 5) {
            bills5 = remainder / 5;
            remainder %= 5;
        }

        coins = remainder / 2; // Remaining amount in 2€ coins

        ch.coins=coins;
        ch.bills5=bills5;
        ch.bills10=bills10;
        return ch;
    }

    public static void main(String[] args) {
        long s = 21; // Example test case
        System.out.println("coins: ");
        Change result = optimalChange(s);

        System.out.println("coins: " + result.coins);
        System.out.println("bills5: " + result.bills5);
        System.out.println("bills10: " + result.bills10);
    }
}
