// package Challenge05;

import java.util.Scanner;

public class fifth {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome To Number System : ");

    System.out.println("Please Enter Your Number : ");

    int first = input.nextInt();

    System.out.println("Please Enter Your Number : ");

    int second = input.nextInt();

    int lcm = lcm(first, second);

    System.out.println("LCM of the two numbers is :"+lcm);

}

    public static int lcm(int first , int second){
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {

                return factor;


                
            }
            i++;
        }

      
    }
}