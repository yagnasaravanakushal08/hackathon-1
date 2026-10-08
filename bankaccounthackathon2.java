import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    double checkBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accountNumber = sc.nextLine();
        String accountHolderName = sc.nextLine();
        double balance = sc.nextDouble();

        BankAccount account =
            new BankAccount(accountNumber, accountHolderName, balance);

        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayAccount();

        sc.close();
    }
}