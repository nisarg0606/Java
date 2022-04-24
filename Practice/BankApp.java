package Practice;

import java.util.Scanner;

// when I rerun the code then I want the previous balance I inputted to be the new balance
class BankAccount {
    String name;
    double balance;
    long accountNumber;

    public BankAccount(String name, double balance, long accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        // System.out.println("Balance: " + balance);
    }

    public void getBalance() {
        System.out.println("Balance: " + balance);
    }
    public void inputs()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1 --- Deposit");
        System.out.println("2 --- Withdraw");
        System.out.println("3 --- Print");
        // System.out.println("4 --- Get Balance");
        System.out.println("5 --- Exit");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter the amount to deposit: ");
                double amount = input.nextDouble();
                deposit(amount);
                break;
            case 2:
                System.out.println("Enter the amount to withdraw: ");
                double amount1 = input.nextDouble();
                withdraw(amount1);
                break;
            case 3:
                print();
                break;
            case 4:
                getBalance();
                break;
            case 5:
                System.out.println("Thank you for using the bank app");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your account number: ");
        int accountNumber = input.nextInt();

        System.out.println("Enter your balance: ");
        double balance = input.nextDouble();

        BankAccount account = new BankAccount(name, balance, accountNumber);

        while (true) {
            account.inputs();
            account.getBalance();
            System.out.println("Do you want to continue? (y/n)");
            String answer = input.next();
            if (answer.equals("n") || answer.equals("N")) {
                break;
            }
        }
        input.close();
    }
}