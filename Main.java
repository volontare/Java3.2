public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long amount = 1_100;
        long bonus = amount/100;
        long newbalance = balance + amount;
        if (amount >= 1_000) {
            newbalance = balance + amount + bonus;
        } else {
            newbalance = balance + amount;
        }
        System.out.println(newbalance);
    }
}
