package Challenge05;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long fac =  fact(num);
        System.out.println("Factorial is : " + fac);


    }

public static long fact(int num){
    if(num < 2){
        return 1;
    }
    long fac = 1;
    int i = 2;
    while (i <= num) {
        fac *= i;
        i++;
        
    }


    return fac;

}

    
}
