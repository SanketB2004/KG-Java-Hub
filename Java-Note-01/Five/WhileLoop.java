import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("This Is While Loop Section: ");
// Countting
        int a = 0 ;   // inisalization
        while (a < 10) {  // Condition
            a++;          // updation
            System.out.println(a); // Actual work Print In Terminal
        }
//  Reverse Counting
        int b = 10 ;
        while (b > 0) {
            b--;
            System.out.println(b);
            
        }

        // User To Get Input

    Scanner input = new Scanner(System.in);

    int i = 0;
    while (i < 5) {
        int inp = input.nextInt();
        System.out.println("Your No Is : " + inp);
        i++;
        
    }


    }
}
