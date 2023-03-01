package aarsh.StringFunc;

import java.util.Arrays;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = sc.next();
        System.out.print("Enter String 2: ");
        String s2 = sc.next();
        StringBuffer b1 = new StringBuffer(s1);
        StringBuffer b2 = new StringBuffer(s2);
        char[] c1 = b1.toString().toCharArray();
        char[] c2 = b2.toString().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1);
        System.out.println(c2);
        if(Arrays.equals(c1, c2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
