package JavaNote01.challenges;

import java.util.Scanner;  // Scanner class import for user input

public class cha05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner object for input

        // Taking user name input
        System.out.print("Enter your name: ");
        String name = input.nextLine();  // Read user input

        // Displaying the welcome message
        System.out.println("Welcome To Sanket Home, " + name + "!");

        input.close();  // Closing scanner to avoid resource leak
    }
}
