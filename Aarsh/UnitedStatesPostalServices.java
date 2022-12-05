package aarsh;

public class UnitedStatesPostalServices {
    public static void main(String[] args) {
        int checkBarCode = detCheckSum(95014);
        System.out.println(checkBarCode);
        System.out.println(isCodeValid(checkBarCode));
        System.out.println(genBarCode(95014));
    } // --> maths logic thinking ability 
    public static int detCheckSum(int n) {
        int sum = sumOfDigits(n);
        if (sum % 10 == 0) {
            return n;
        } else
            return ((10 - (sum % 10)) + n);
    }
    static boolean isCodeValid(int n) {
        if (sumOfDigits(n) % 10 == 0)
            return true;
        else
            return false;
    }
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    static int ReverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = (rev*10) + (n % 10);
            n = n / 10;
        }
        return rev;
    }
    public static String genBarDigit(int nVal)
    {
        String arrayofDigits[] = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
        if(nVal > 9 && nVal < 0)
            return null;
        else
            return arrayofDigits[nVal];
    }
    public static String genBarCode(int nCode)
    {
        if(ReverseNumber(nCode) % 10 == 0)
            return "Please enter a valid string staring not with 0";
        int detCheckSum = detCheckSum(nCode); // checksum will get added
        int checkSumValue = detCheckSum - nCode; 
        String barStringCode = "|"; // null
        int ReverseNumber = ReverseNumber(nCode); // reversing detChecksum 95014 --> 41059
        while(ReverseNumber > 0)
        {
            int temp = ReverseNumber % 10;
            barStringCode = barStringCode.concat(genBarDigit(temp));
            ReverseNumber = ReverseNumber / 10;
        }
        barStringCode = barStringCode.concat(genBarDigit(checkSumValue)); //added check sum value 
        return barStringCode + "|";
    }
}