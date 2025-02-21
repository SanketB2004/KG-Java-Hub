import java.util.Scanner;

public class AssignmentChallen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Swap Code 😊\n \n ");

        System.out.println("Enter A Number Of A");
        int a = input.nextInt();
        System.out.println("Enter A Number Of B");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Swaping Method 🐼🐼");

        System.out.println("Value Of All Element A :" + a);
        System.out.println("Value Of All Element B :" + b);

    }

}
