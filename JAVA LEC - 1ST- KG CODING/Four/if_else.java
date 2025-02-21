import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A True Or False  :");
        Boolean ame = input.nextBoolean();

        String name = "Bob";

        if (ame) {
            System.out.println("Before If");
            System.out.println("Mr" + name);

        } else {
            System.out.println("Mr Bob Is  Busy");
            System.out.println("After If");
        }

        System.out.println("You Are Seneare Citizhan Ya Adult");

        Boolean first = true;
        Boolean second = true;

        if (first) {
            System.out.println("Hi Cityzen");
        } else if (second) {
            System.out.println("Hello Adult");
        } else {
            System.out.println("hi Chiled Not A Entry A Pub");
        }
    }

}
