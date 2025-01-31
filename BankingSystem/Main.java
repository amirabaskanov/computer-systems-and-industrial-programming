import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to Java Bank! What would you like to do?");
            System.out.println("1. Create an account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Display all accounts");
            System.out.println("6. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Account Number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.println("Enter Your Name: ");
                    String accountHolder = scanner.nextLine();
                    System.out.println("Enter Initial Balance: ");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    Account account = new Account(accountNumber, accountHolder, initialBalance);
                    bank.addAccount(account);
                    break;

                case 2:
                    System.out.println("Enter account number: ");
                    String depositAccountNumber = scanner.nextLine();
                    Account depositAccount = bank.findAccount(depositAccountNumber);
                    if (depositAccount != null) {
                        System.out.println("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        depositAccount.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter account number: ");
                    String withdrawAccountNumber = scanner.nextLine();
                    Account withdrawAccount = bank.findAccount(withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter account number: ");
                    String checkBalanceAccountNumber = scanner.nextLine();
                    Account checkBalanceAccount = bank.findAccount(checkBalanceAccountNumber);
                    if (checkBalanceAccount != null) {
                        checkBalanceAccount.checkBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    bank.displayAllAccounts();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
