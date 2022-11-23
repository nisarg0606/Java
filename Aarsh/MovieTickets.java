/*
 * Author: Nisarg Shah
 * Date: 20/12/2022
 * Topic: Movie Tickets
 * Description: 
 * Write an application to pre-sell a limited number of cinema tickets. Each
 * buyer can buy as many 4 tickets. No more than 100 tickets can be sold.
 * Implement a program called Q2 that prompts the user for the desired number of
 * tickets and then display the number of remaining tickets. The program will
 * continue until all 100 tickets have been sold with the limitation that no
 * more than 100 tickets can be sold (user is just prompted to pick a different
 * number of tickets). The program should end by printing out the total number
 * of ticket buyers. Something along the lines of
 * 
 * There were 41 different ticket buyers
 */

package Aarsh;

import java.util.Scanner;

public class MovieTickets {
    public static void main(String[] args) {
        // total number of tickets
        int tickets = 10;
        // total number of buyers
        int buyers = 0;
        // number of tickets bought by a buyer
        int ticketsBought = 0;
        Scanner input = new Scanner(System.in);
        // loop until all tickets are sold
        while (tickets > 0) {
            // prompt user for number of tickets
            System.out.println("How many tickets would you like to buy? (Max 4)");
            // get number of tickets from user
            ticketsBought = input.nextInt();
            // check if number of tickets is valid
            if (ticketsBought > 4 || ticketsBought <= 0) {
                // if not valid, prompt user to enter a valid number
                System.out.print("You can only buy 4 tickets at a time ");
                System.out.println("and you cannnot enter a negative value.");
                // if user tries to buy more tickets than there are available
            } else if (ticketsBought > tickets) {
                // tell user how many tickets are available
                System.out.println("There are only " + tickets + " tickets left");
            } else { // if user tries to buy a valid number of tickets
                // subtract number of tickets bought from total number of tickets
                tickets -= ticketsBought;
                // add 1 to number of buyers
                buyers++;
            }
        }
        // print number of buyers
        System.out.println("There were " + buyers + " different ticket buyers");
        input.close(); // close the scanner (good practice)
    }
}
