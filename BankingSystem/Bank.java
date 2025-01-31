import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    //Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    //Add a new account
    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    //Find an account by account number
    public Account findAccount(String accountNumber){
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    //Display all accounts
    public void displayAllAccounts(){
        System.out.println("All accounts:");
        for (Account account : accounts){
            account.checkBalance();
            System.out.println("------------------");
        }
    }
}
