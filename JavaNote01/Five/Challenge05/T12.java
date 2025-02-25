import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Star Pattern System : ");

        System.out.println("Please Enter Your Number : ");

        int row = input.nextInt();
        prindThirdPattern(row);

 

        

    }//1st Pattern
    public static void printFirstPattern(int maxRows) {

        int row = 0;
        while (row < maxRows) {
            System.out.print("*");

            int second = 0;
            while (second < row) {
                System.out.print(" *");
                second++;

            }
            System.out.println();
            row++;

        }

}

// 2nd Pattern 
public static void prindSecondPattern(int maxRows){
    int row = maxRows;
    while (row > 0) {
        

        int second = 0;
        while (second < row) {
            System.out.print(" *");
            second++;

        }
        System.out.println();
        row--;

    }

}
// 3rd Pattern
public static void prindThirdPattern(int maxRows){
    System.out.println("\n Here isLeft Half Pyramid");
    int rows = maxRows;
    while (rows > 0) {
        // this loop print spaces
        int j = 0;
        while (j < rows - 1) {
            System.out.print("  ");
            j++;
        }
        // This Loop Pint Stars
        

        int i = 0;
        while (i <=(maxRows-rows)) {
            System.out.print("* ");
            i++;

        }
        System.out.println();
        rows--;

    }

}

}
