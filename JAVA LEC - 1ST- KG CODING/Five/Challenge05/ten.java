import java.util.Scanner;

public class ten {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Number System : ");

        System.out.println("Please Enter Your Number : ");

        int num = input.nextInt();

        boolean isAramstrong = isAramstrong(num);
        if (isAramstrong) {
            System.out.println("Your No Is Aramstorng");
        } else {
            System.out.println("Your No Is Not AeramStrong");
        }

    }

    public static boolean isAramstrong(int num) {
        int noOfDigit = noOfDigit(num);
        int numCopy = num;
        int finalNumber = 0;

        while (num > 0) {
            int digi = num % 10;
            num /= 10;
            finalNumber += power(digi, noOfDigit);

        }

        return finalNumber == numCopy;
    }

    public static int noOfDigit(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num /= 10;
        }
        return digit;
    }

    // Power Funcation
    public static int power(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }

        return result;
    }
}
