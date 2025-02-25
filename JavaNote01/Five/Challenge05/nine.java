import java.util.Scanner;

public class nine {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Number System : ");

        System.out.println("Please Enter Your Number : ");

        int num = input.nextInt();
        System.out.println("Here Is The Fibonaci : ");
        printFebonaci(num);


    }
public static void printFebonaci(int num){
    
    if (num < 0) return;
    System.out.print("0 ");
    if (num==0) return ;
    System.out.print("1 ");

        
    
    int first = 0  , second = 1 ;
     
    while (first + second <= num) {
        int third = first +second;
        System.out.print(third + " ");
        first = second;
        second =third;

    }


}
}