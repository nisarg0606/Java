package OCJP;

public class ArmstrongUsingMath {
    public static void main (String[] args) {
        int  c, count = 0;
        double sum = 0;
        System.out.println("Armstrong numbers till 10 Lakhs are as follows: ");
        for(int i = 0; i <=1000000; i++){
            int n = i;
            int temp = n;
            while(temp > 0){
                count++;
                temp = temp / 10;
            }
            while(n > 0){
                c = n % 10;
                n = n / 10;
                sum = sum + (Math.pow(c, count));
            }
            if(sum == i)
                System.out.print(i + "  ");
            sum = count = 0;
        }
    }
}