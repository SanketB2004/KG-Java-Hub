package Challenge05;

import java.util.Scanner;

public class second {
    

    public static void main(String[] args) {
        

        Scanner input =new Scanner(System.in);
        System.out.println("Welcome To Odd Calculater");
        System.out.println("Enter No : ");
        int num = input.nextInt();
        int sum = OddSum(num);
        System.out.println("OddSum Till " + num + " is: "+ sum);


    }
public static int OddSum(int num){
    int sum = 0;
    int i = 1;
    while (i <= num ) {
        sum = sum+i;
        i += 2;
        
    }



   return sum;
}
}
