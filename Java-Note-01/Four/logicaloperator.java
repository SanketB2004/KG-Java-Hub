import java.util.Scanner;

public class logicaloperator {

    public static void main(String[] args) {

        System.out.println("Wlecome To Tiket Disccount Calculatour :");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Age :");

        int age = input.nextInt();
        System.out.println("Please Select A Male (True/False) :");

        Boolean innn = input.nextBoolean();

        if(age < 5){
            System.out.println("You Goat 75% Discount");

        }else if(innn){
            System.out.println("You Goat 50% Discount");
        }else if(age > 60 && !innn){
            System.out.println("You Goat 99% Discount");
        }else{
            System.out.println("Not Discount");
        }


    }

}
