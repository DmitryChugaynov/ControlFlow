
public class ForStatement {

    public static void main(String[] args) {

        System.out.println(calculateInterest(10000.0,2.0));
        System.out.println(calculateInterest(10000.0,3.0));
        System.out.println(calculateInterest(10000.0,4.0));
        System.out.println(calculateInterest(10000.0,5.0));
        System.out.println(calculateInterest(10000.0,6.0));

        for (double i = 2; i < 9; i++) {
            System.out.println("10 000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        System.out.println("");

        for (double i = 8; i >= 2; i--) {
            System.out.println("10 000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        System.out.println(isPrime(47));

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }
}
