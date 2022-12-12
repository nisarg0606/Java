package aarsh;

import java.util.Scanner;

public class ScannerMethods {
    public static int ScanInteger()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    public static float ScanFloat()
    {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        return n;
    }

    public static String ScanString()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
}
