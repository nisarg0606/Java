package USA_Practice;

import java.util.Scanner;

public class StringPractice29thMay2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("Using String Methods");
            System.out.println("The first and last character of string is same so the string will be: "
                    + str.substring(1, str.length() - 1));
        } else {
            System.out.println("The First and the last character of string is not same so the string will be: " + str);
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        if (stringBuffer.charAt(0) == stringBuffer.charAt(stringBuffer.length() - 1)) {
            stringBuffer.deleteCharAt(0);
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            System.out.println("Using StingBuffer/Builder");
            System.out.println("The first and last character of string is same so the string will be: " + stringBuffer);
        } else {
            System.out.println(
                    "The First and the last character of string is not same so the string will be: " + stringBuffer);
        }
    }
}



class CharacterCheck{
    public String FirstTwoCharacterCheck(String str){
        if(str.charAt(0) =='g')
        {
            if(str.charAt(1) == 'h')
            {
                return str;
            }
            else{
                    
            }
        }

        return null;
    }
    public static void main(String[] args) {
        
    }
}