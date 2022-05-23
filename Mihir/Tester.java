package Mihir;

import java.io.*;

public class Tester {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Please enter your name");
            String name = br.readLine();
            System.out.println("Please enter your age");
            String age = br.readLine();
            System.out.println("Please enter the type of membership you want");
            String mem = br.readLine();
            if (mem.equalsIgnoreCase("Executive")) {
                Executive exe = new Executive(name, age);
                exe.welcomeMessage();
                System.out.println("1-Purchase");
                System.out.println("2-return");
                System.out.println("3. Redeem");
                System.out.println("4.-Different New Member");
                System.out.println("Please enter your choice");
                String choice = br.readLine();
                while (!"4".equalsIgnoreCase(choice)) {
                    if ("1".equalsIgnoreCase(choice)) {
                        System.out.println("What is the purchase amount?");
                        double pa = Double.parseDouble(br.readLine());
                        exe.PointsCalculation(pa, "purchase");
                        exe.choices();
                        System.out.println("Please select one");
                        String x = br.readLine();
                        choice = x;
                    } else if ("2".equalsIgnoreCase(choice)) {
                        System.out.println("What is the return amount?");
                        double pa = Double.parseDouble(br.readLine());
                        exe.PointsCalculation(pa, "return");
                        exe.choices();
                        System.out.println("Please select one");
                        String x = br.readLine();
                        choice = x;
                    } else if ("3".equalsIgnoreCase(choice)) {
                        double x = exe.PointsReedeem(exe.initialPoints);
                        System.out.println("Your redeem amount is $" + x);
                        exe.choices();
                        System.out.println("Please select one");
                        String px = br.readLine();
                        choice = px;
                    }
                }
            } else if (mem.equalsIgnoreCase("Goldstar")) {
                GoldStar exe = new GoldStar(name, age);
                exe.welcomeMessage();
                System.out.println("1-Purchase");
                System.out.println("2-return");
                System.out.println("3. Redeem");
                System.out.println("4.-Different New Member");
                System.out.println("Please enter your choice");
                String choice = br.readLine();
                while (!"4".equalsIgnoreCase(choice)) {
                    if ("1".equalsIgnoreCase(choice)) {
                        System.out.println("What is the purchase amount?");
                        double pa = Double.parseDouble(br.readLine());
                        exe.PointsCalculation(pa, "purchase");
                        exe.choices();
                        System.out.println("Please select one");
                        String px = br.readLine();
                        choice = px;
                    } else if ("2".equalsIgnoreCase(choice)) {
                        System.out.println("What is the return amount?");
                        double pa = Double.parseDouble(br.readLine());
                        exe.PointsCalculation(pa, "return");
                        exe.choices();
                        System.out.println("Please select one");
                        String px = br.readLine();
                        choice = px;
                    } else if ("3".equalsIgnoreCase(choice)) {
                        double x = exe.PointsReedeem(exe.initialPoints);
                        System.out.println("Your redeem amount is $" + x);
                        exe.choices();
                        System.out.println("Please select one");
                        String px = br.readLine();
                        choice = px;
                    }
                }
            }
        }
    }
}
