package aarsh.eCommerce;

import java.util.LinkedList;
import java.util.Scanner;

public class ShoppingCart {
    private LinkedList<Item> cart = new LinkedList<Item>();

    public void addItem(Item item, Scanner sc) {
        if (isItemExists(item)) {
            System.out.println("Item is already present in cart do you want to update quantity? (y/n)");
            char choice = sc.next().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                System.out.println("Enter quantity: ");
                int quantity = sc.nextInt();
                updateQuantity(item, quantity);
            } else {
                System.out.println("Item is not added to cart...");
            }
        } else {
            item.setQuantity(1);
            cart.add(item);
        }
    }

    public void addItem(Item item, int quantity) {
        if (isItemExists(item))
            updateQuantity(item, quantity);
        item.setQuantity(quantity);
        cart.add(item);
    }

    public void addItem(Item item, int quantity, double discount) {
        double discountedPriceOfOneItem = applyDiscount(item.getPrice(), discount);
        System.out.println("Discounted price of one item: " + discountedPriceOfOneItem);
        if (isItemExists(item))
            updateQuantity(item, quantity);
        item.setQuantity(quantity);
        item.setPrice(discountedPriceOfOneItem);
        cart.add(item);
    }

    public void removeItem(Item item) {
        int flag = 0;
        for (Item i : cart) {
            if (i.getName().equals(item.getName())) {
                cart.remove(i);
                System.out.println(i.getName() + " is removed successfully from the cart...");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("Item is not present in cart which you are trying to remove...");

    }

    public void displayCart() {
        if (cart.size() == 0)
            System.out.println("Your cart is empty...");
        for (Item i : cart) {
            System.out.println("Name: " + i.getName() + " Quantity: " + i.getQuantity() + " Price: "
                    + (i.getPrice() * i.getQuantity()));
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        if (cart.size() == 0)
            System.out.println("Your cart is empty...");
        for (Item i : cart) {
            totalCost = totalCost + (i.getPrice() * i.getQuantity());
        }
        return totalCost;
    }

    public void updateQuantity(Item item, int quantity) {
        for (Item i : cart) {
            if (i.getName().equals(item.getName())) {
                i.setQuantity(quantity);
                break;
            }
        }
    }

    public double applyDiscount(double price, double discount) {
        return price - (price * discount / 100);
    }

    public boolean isItemExists(Item item) {
        for (Item i : cart) {
            if (i.getName().equals(item.getName()))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        while (true) {
            System.out.println("1. Add item to cart without quantity and discount");
            System.out.println("2. Add item to cart with quantity and without discount");
            System.out.println("3. Add item to cart with quantity and discount");
            System.out.println("4. Remove item from cart");
            System.out.println("5. Display cart");
            System.out.println("6. Calculate total cost");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            Item item = new Item();
            switch (choice) {
                case 1:
                    System.out.println("Enter item name: ");
                    String name = sc.next();
                    System.out.println("Enter item price: ");
                    double price = sc.nextDouble();
                    item = new Item(name, price);
                    cart.addItem(item, sc);
                    break;
                case 2:
                    System.out.println("Enter item name: ");
                    name = sc.next();
                    System.out.println("Enter item price for 1 item: ");
                    price = sc.nextDouble();
                    System.out.println("Enter item quantity: ");
                    int quantity = sc.nextInt();
                    item = new Item(name, price);
                    cart.addItem(item, quantity);
                    break;
                case 3:
                    System.out.println("Enter item name: ");
                    name = sc.next();
                    System.out.println("Enter item price for 1 item: ");
                    price = sc.nextDouble();
                    System.out.println("Enter item quantity: ");
                    quantity = sc.nextInt();
                    System.out.println("Enter item discount: ");
                    double discount = sc.nextDouble();
                    item = new Item(name, price);
                    cart.addItem(item, quantity, discount);
                    break;
                case 4:
                    System.out.println("Enter item name: ");
                    name = sc.next();
                    item = new Item(name, 0);
                    cart.removeItem(item);
                    break;
                case 5:
                    cart.displayCart();
                    break;
                case 6:
                    System.out.println("Total cost: " + cart.calculateTotalCost());
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice...");
                    break;
            }
        }
    }
}
