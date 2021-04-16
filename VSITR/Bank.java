package VSITR;
import java.util.Scanner;
public class Bank {
    long accountnumber;
    String name;
    float balance=0;
    public Bank(long a, String n)
    {
        accountnumber = a;
        name = n;
    }
    public void depositMoney()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount you want to deposit: ");
        float amount = sc.nextFloat();
        this.balance += amount;
        sc.close();
    } 
    public void withdrawMondey()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount you want to withdraw: ");
        float amount = sc.nextFloat();
        if(amount > this.balance)
        System.out.println("Insufficient Account Balance to withdraw this Amount....");
        else
        this.balance -= amount;
        sc.close();
    }
    public void askBalance()
    {
        System.out.println("Account & Balace Info:");
        System.out.println("Account no: "+ this.accountnumber);
        System.out.println("Name: "+ this.name);
        System.out.println("Balance: "+ this.balance);
    }
    public static void main(String[] args) {
        Bank acc1 = new Bank(1, "Nisarg");
        Bank acc2 = new Bank(2, "Rutvik");
        acc1.depositMoney();
        acc1.withdrawMondey();
        acc2.depositMoney();
        acc2.withdrawMondey();
        acc1.askBalance();
        acc2.askBalance();
    }
}