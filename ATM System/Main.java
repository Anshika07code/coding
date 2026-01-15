public class Main {
    public static void main(String[] args) {
        Account acc = new Account(5000);
        ATM atm = new ATM(acc);
        atm.start();
    }
}
