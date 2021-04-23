package RahulSir.CollectionDemo;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        LinkedList<Products> linkedList = new LinkedList<>();
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1) For Insert           ");
            System.out.println("2) FOR Update           ");
            System.out.println("3) FOR Delete           ");
            System.out.println("4) Display All records  ");
            System.out.println("5) Searching by Name	");
            System.out.println("6) Searching by price  	");
            System.out.println("0) Exit	");

            choice = sc.nextInt();
            switch (choice) {
            case 1:
                Products p = new Products();
                p.scan();
                linkedList.add(p);
                System.out.println("Product record inserted successfully...");
                break;
            case 2:
                System.out.println("Enter id which you want to update - ");
                int updateid = sc.nextInt();
                int i = 0;
                for (; i < linkedList.size(); i++) {
                    if (linkedList.get(i).getId() == updateid) {
                        break;
                    }
                }
                p = linkedList.get(i);
                p.update();
                linkedList.set(i, p);
                System.out.println("Updated...");
                break;
            case 3:
                System.out.println("Enter which id you want to delete: ");
                int delid = sc.nextInt();
                for (i = 0; i < linkedList.size(); i++) {
                    if (linkedList.get(i).getId() == delid) {
                        break;
                    }
                }
                linkedList.remove(i);
                System.out.println("Product record deleted...");
                System.out.println();
                break;
            case 4:
                System.out.println();
                for (i = 0; i < linkedList.size(); i++) {
                    p = linkedList.get(i);
                    System.out.println("Id no: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice());
                }
                System.out.println();
                break;
            case 5:
                System.out.print("Enter the name you want to search for: ");
                sc.nextLine();
                String pname = sc.nextLine();
                boolean flag = false;
                i = 0;
                for (; i < linkedList.size(); i++) {
                    if (pname.equalsIgnoreCase(linkedList.get(i).getName())) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("The name you searched for is found successfully...");
                    p = linkedList.get(i);
                    System.out.println("Id no: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice());
                } else {
                    System.out.println("Product record not found...");
                }
                break;
            case 6:
                System.out.print("Enter the price of the product you are searching for: ");
                float sprice = sc.nextFloat();
                flag = false;
                LinkedList<Integer> li = new LinkedList<Integer>();
                i = 0;
                for (; i < linkedList.size(); i++) {
                    if (sprice == (linkedList.get(i).getPrice())) {
                        flag = true;
                        li.add(i);
                        continue;
                    }
                }
                if (flag) {
                    System.out.println("Item founded....");
                    for (int j = 0; j < li.size(); j++) {
                        p = linkedList.get(li.get(j));
                        System.out.println("Id: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice());
                    }
                } else {
                    System.out.println("No product found for the price you entered...");
                }
                break;
            case 0:
                System.out.println("Thanks for visiting....");
                break;
            default:
                System.out.println("Enter a valid number...");
                break;
            }
        }
        sc.close();
    }
}