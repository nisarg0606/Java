package OCJP;
public class TwinNumber{
    public static void main(String[] args) {
        int sum , mul, temp, a;
        for(int i = 100; i <= 999; i++)
        {
            mul = 1;
            sum = 0;
            a = i;
            while(a> 0) {
                temp = a % 10;
                sum = sum + temp;
                mul = mul * temp;
                a = a / 10;
            }
            if(sum == mul)
            {
                System.out.println(i+" is a twin number.");
            }
        }
    }
}