package Challenge05;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Number System : ");

        System.out.println("Please Enter Your Number : ");

        int num = input.nextInt();

        int reverse = reverse(num);

        System.out.println("Reverse of your number is : " + reverse);

    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }
        return newNum;
    }
}
