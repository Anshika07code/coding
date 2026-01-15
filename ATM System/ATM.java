import java.util.Scanner;

class ATM {
    private final int pin = 1234;
    private Account account;
    private Scanner sc = new Scanner(System.in);

    ATM(Account account) {
        this.account = account;
    }

    void start() {
        System.out.print("Enter PIN: ");
        if (sc.nextInt() != pin) {
            System.out.println("Invalid PIN");
            return;
        }

        int choice;
        do {
            System.out.println("\n1.Balance 2.Deposit 3.Withdraw 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Amount: ");
                    account.deposit(sc.nextDouble());
                    System.out.println("Deposit Successful");
                    break;

                case 3:
                    System.out.print("Amount: ");
                    if (account.withdraw(sc.nextDouble()))
                        System.out.println("Withdraw Successful");
                    else
                        System.out.println("Insufficient Balance");
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        } while (choice != 4);
    }
}
