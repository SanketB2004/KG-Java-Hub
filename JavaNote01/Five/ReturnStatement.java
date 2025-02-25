import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {

        greet();

        int s1 = readno();

        int second = readno();

        int sum = s1 + second;
        System.out.println("Solution " + sum);

    }

    public static int readno() {
        Scanner input = new Scanner(System.in);
        System.out.print("Pleses Enter The No : ");
        int first = input.nextInt();

        return first;
    }

    public static void greet() {
        System.out.println("Welcome To Calculator\n");
    }
}
