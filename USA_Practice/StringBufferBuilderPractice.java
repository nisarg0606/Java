package USA_Practice;

import java.util.Scanner;
public class StringBufferBuilderPractice {
    public static void main(String[] args) {
        /*
         * Start:
         * Step 1: You can take a Static 2 strings or you can take strings from the user
         * and
         * create a empty C StringBuffer Directly
         * Step 2: You need to pass those strings as an parameter to the StingBuilder
         * Step 3: initialize a flag varible
         * Step 4: Start the while loop
         * Step 5: Try catch for IndexOutOfBound Exception
         * Step 5: Compare the first Characters of both the strings(CharAt) using if
         * else
         * Step 6: in if else you need to append that character in C string and after
         * appending
         * you need to delete that chacter
         * Step 7: when one of the string becomes null(you will get index of of bound
         * exception)
         * you need to end the while loop by making the flag varible change
         * Step 8: Append the remaining string from A or B to the end of C String
         * Step 9: Print the C String
         * End:
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string a: ");
        String a = sc.next();// mango // soham
        System.out.println("Enter the string b: ");
        String b = sc.next(); // apple // nidhish
        StringBuffer stringBuffera = new StringBuffer(a);
        StringBuffer stringBufferb = new StringBuffer(b);
        StringBuffer stringBufferc = new StringBuffer();
        int flag = 1;
        while (flag != 0) // compare characters and the smaller one will be appended to the new string
        {
            try { // ascii value in c or uncii value in java
                if (stringBuffera.charAt(0) > stringBufferb.charAt(0))
                // it will compare the ascii / unicode value for us
                {
                    stringBufferc.append(stringBufferb.charAt(0));
                    stringBufferb.deleteCharAt(0); // string null
                } else {
                    stringBufferc.append(stringBuffera.charAt(0));
                    stringBuffera.deleteCharAt(0); // string null
                }
            } catch (Exception e) {
                flag = 0;
            }
        }
        if (stringBuffera.length() > stringBufferb.length()) {
            stringBufferc.append(stringBuffera);
        } else {
            stringBufferc.append(stringBufferb);
        }
        String c = stringBufferc.toString();
        System.out.println("The Final String is : " + c);
        /*
            apple mango
            while{

                a - m = a        a-> pple    b-> mango   c-> a
                p - m = m        a-> pple    b-> ango   c-> am
                p - a = a        a-> pple    b-> ngo   c-> ama
                p - n = n        a-> pple    b-> go   c-> aman
                p - g = g        a-> pple    b-> o   c-> amang
                p - o = o        a-> pple    b->    c-> amango (b string becomes null and so in the next step it will throw indexoutofbound exception as it is null)
                p - o = o        a-> pple    b->    c-> amango
            }terminated
            a-> pple which is greater than b(null) pple will be appended to c 
            so, C will become amangopple

        */
    }
}
