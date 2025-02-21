import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        
        
         Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Number System : ");

        System.out.println("Please Enter Your Number : ");

        int num = input.nextInt();
        boolean reverse =isPalindrome(num);
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your No Pailendrone");
        }else{
            System.out.println("Not A Palenddrome");
        }
    }



public static boolean isPalindrome(int num){
int reverse = reverse(num);

    return num == reverse;
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
