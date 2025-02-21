// package Challenge05;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        int sum = sumOfDigit(num);
        System.out.println("Sum of digit is : " + sum);

      
    }
public static int sumOfDigit(int num){

    int sum = 0;
    while (num > 0) {
        
        sum += (num % 10);

        num /= 10;


    }

    return sum;
}
}
