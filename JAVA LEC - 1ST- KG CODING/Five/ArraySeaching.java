import java.util.Scanner;

public class ArraySeaching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 3, 6, 8, 87, 84, 569, 48, 65, 75, 69, 752, 6, 8, 7 };
        System.out.println("Wlecome To Array Serchint");
        System.out.println("Enter the No Seach :");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Array Is Found");
        } else {
            System.out.println("Array Not Found");
        }

        String[] strArr = new String[4];
        strArr[0] = "My String";
        String[] newstrr = { " First" , "Second" , "Third","Fourth"};
        System.out.println(newstrr.length);
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;

            }
            index++;
        }
        return false;

    }

}
