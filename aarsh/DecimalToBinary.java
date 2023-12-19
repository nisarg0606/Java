package aarsh;

public class DecimalToBinary {

    public static int decimalToBinary(int decimal){
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index] = decimal % 2; // index = index + 1
            decimal = decimal / 2;
            index++;
        }
        // arr.length -- > 5
        String binaryStr = "";
        for(int i = index - 1; i >= 0; i--){
            binaryStr = binaryStr + binary[i];
        }
        // int binaryInt = (int) binaryStr;
        return Integer.parseInt(binaryStr);
    } 
    public static void main(String[] args) {
        System.out.println(DecimalToBinary.decimalToBinary(123));
        System.out.println(Integer.toBinaryString(123));
    }
}
