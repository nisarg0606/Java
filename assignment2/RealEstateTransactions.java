package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class RealEstateTransactions {
    public static ArrayList<RAddress> loadListings(String sPath) {
        ArrayList<RAddress> aListings = new ArrayList<RAddress>();
        try {
            File fFile = new File(sPath);
            Scanner sScan = new Scanner(fFile);
            sScan.nextLine();
            while (sScan.hasNextLine()) {
                String sLine = sScan.nextLine();
                String[] sSplit = sLine.split(",");
                RAddress rAddress = new RAddress(sSplit[0], sSplit[1], Integer.parseInt(sSplit[2]),
                        Integer.parseInt(sSplit[3]), Integer.parseInt(sSplit[4]), sSplit[5],
                        Double.parseDouble(sSplit[6]));
                aListings.add(rAddress);
            }
            sScan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return aListings;
    }

    public static void q1(ArrayList<RAddress> obList) {
        obList.stream().sorted((a, b) -> (int) (b.getdPrice() - a.getdPrice())).limit(10)
                .forEach(System.out::println);
    }

    public static void q2(ArrayList<RAddress> obList, String sCity) {
        obList.stream().filter(a -> a.getaCity().equals(sCity)).sorted((a, b) -> (int) (a.getdPrice() - b.getdPrice()))
                .forEach(System.out::println);
    }

    public static int q3(ArrayList<RAddress> obList) {
        return (int) obList.stream().filter(a -> a.getdPrice() > 400000).count();
    }

    public static ArrayList<RAddress> q4(ArrayList<RAddress> obList, int nBed) {
        ArrayList<RAddress> aList = new ArrayList<RAddress>();
        obList.stream().filter(a -> a.getnBeds() >= nBed).forEach(aList::add);
        return aList;
    }

    public static ArrayList<RAddress> q5(ArrayList<RAddress> obList, Predicate<RAddress> fPred,
            Comparator<RAddress> fComp) {
        ArrayList<RAddress> aList = new ArrayList<RAddress>();
        obList.stream().filter(fPred).sorted(fComp).forEach(aList::add);
        return aList;
    }

    public static ArrayList<String> q6(ArrayList<RAddress> obList) {
        ArrayList<String> aList = new ArrayList<String>();
        obList.stream().map(a -> a.getaCity()).distinct().sorted().forEach(aList::add);
        return aList;
    }

    public static RAddress q7(ArrayList<RAddress> obList, String sName) {
        return obList.stream().filter(a -> a.getaCity().equals(sName))
                .max((a, b) -> (int) (a.getdPrice() - b.getdPrice()))
                .get();
    }

    public static ArrayList<RAddress> q8(ArrayList<RAddress> obList) {
        ArrayList<RAddress> aList = new ArrayList<RAddress>();
        obList.stream().sorted((a, b) -> (int) (b.getdPrice() - a.getdPrice())).forEach(a -> {
            if (aList.stream().noneMatch(b -> b.getaCity().equals(a.getaCity()))) {
                aList.add(a);
            }
        });
        return aList;
    }

    public static ArrayList<String> q9(ArrayList<RAddress> obList) {
        ArrayList<String> aList = new ArrayList<String>();
        obList.stream().map(a -> a.getaCity()).distinct().sorted().forEach(a -> {
            aList.add(a + ":" + obList.stream().filter(b -> b.getaCity().equals(a)).count());
        });
        return aList;
    }

    public static ArrayList<RAddress> q10(ArrayList<RAddress> obList, Predicate<RAddress> fPred,
            Function<RAddress, RAddress> fMap) {
        ArrayList<RAddress> aList = new ArrayList<RAddress>();
        obList.stream().filter(fPred).map(fMap).forEach(aList::add);
        return aList;
    }

    public static void update(ArrayList<RAddress> obList) {
        obList.stream().forEach(a -> {
            if (a.getaCity().equals("SACRAMENTO")) {
                if (a.getnBaths() < 4) {
                    a.setdPrice(a.getdPrice() * 1.1);
                } else {
                    a.setdPrice(a.getdPrice() * 1.15);
                }
            }
        });
        try {
            PrintWriter pw = new PrintWriter(new File("NewListings.csv"));
            StringBuilder sb = new StringBuilder();
            /* street,city,beds,baths,sq__ft,type,price */
            sb.append("street");
            sb.append(',');
            sb.append("city");
            sb.append(',');
            sb.append("beds");
            sb.append(',');
            sb.append("baths");
            sb.append(',');
            sb.append("sq__ft");
            sb.append(',');
            sb.append("type");
            sb.append(',');
            sb.append("price");
            sb.append('\n');
            obList.stream().forEach(a -> {
                sb.append(a.getaAddress());
                sb.append(',');
                sb.append(a.getaCity());
                sb.append(',');
                sb.append(a.getnBeds());
                sb.append(',');
                sb.append(a.getnBaths());
                sb.append(',');
                sb.append(a.getnSqaure());
                sb.append(',');
                sb.append(a.getaType());
                sb.append(',');
                sb.append(a.getdPrice());
                sb.append('\n');
            });
            pw.write(sb.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // read the data from realEstate.csv
        ArrayList<RAddress> obList = loadListings("realEstate.csv");
        System.out.println("------------------------Question 1----------------------");
        q1(obList);
        System.out.println("------------------------Question 2----------------------");
        q2(obList, "ANTELOPE");
        System.out.println("------------------------Question 3----------------------");
        System.out.println(q3(obList));
        System.out.println("------------------------Question 4----------------------");
        q4(obList, 3).forEach(System.out::println);
        System.out.println("------------------------Question 5----------------------");
        q5(obList, a -> a.getnBeds() >= 3, (a, b) -> (int) (a.getdPrice() - b.getdPrice()))
                .forEach(System.out::println);
        System.out.println("------------------------Question 6----------------------");
        q6(obList).forEach(System.out::println);
        System.out.println("------------------------Question 7----------------------");
        System.out.println(q7(obList, "ANTELOPE"));
        System.out.println("------------------------Question 8----------------------");
        q8(obList).forEach(System.out::println);
        System.out.println("------------------------Question 9----------------------");
        q9(obList).forEach(System.out::println);
        System.out.println("------------------------Question 10----------------------");
        q10(obList, a -> a.getnBeds() >= 3, a -> {
            a.setdPrice(a.getdPrice() * 1.1);
            return a;
        }).forEach(System.out::println);
        System.out.println("------------------------Question 11----------------------");
        update(obList);
    }
}
