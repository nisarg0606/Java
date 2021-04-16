package VSITR;
// Up to Rs.2.5 lakh - No Tax (NIL)
// Rs.2.5 lakh - Rs.5 lakh - 5%
// Rs.5 lakh - Rs.7.5 lakh - 10%
// Rs.7.5 lakh - Rs.10 lakh - 15%
// Rs.10 lakh - Rs.12.5 lakh - 20%
// Rs.12.5 lakh - Rs.15 lakh - 25%
// Above Rs.15 lakh - 30% 
public class IncomeTax {
    public static void main(String[] args) {
        long income = 1950000, tax = 0;
        if (income < 250000)
            System.out.println("You need not to pay any tax...");
        if (income >= 250000)
            tax = tax + 12500;
        if (income >= 500000)
            tax = tax + 25000;
        if (income >= 750000)
            tax = tax + 37500;
        if (income >= 1000000)
            tax = tax + 50000;
        if (income >= 1250000)
            tax = tax + 62500;
        if (income >= 1500000)
            tax = tax + 120000;
        System.out.println("Income tax to be paid on your income " + income + " is Rs." + tax);
    }
}