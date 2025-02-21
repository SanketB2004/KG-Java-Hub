package Challenge05;

import java.util.Scanner;

public class firstchallenge {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       System.out.println("Welcome To Multiplication\n");
       System.out.print("Enter No : ");
       int num = input.nextInt();
       print(num);

    }
    public static void print(int num){

        int i = 1;
        while (i <= 10) {
            System.out.println(num +" X " + i + " = " +(num *  i));
            i++;
        }


    }
}
