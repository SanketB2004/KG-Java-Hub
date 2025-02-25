

public class Array {
    public static void main(String[] args) {
        // Define array values using the first method (commented out)
        // This method initializes an array with a specific size and assigns values individually.
        // int[] myArr = new int[5]; // Create an array of size 5
        // myArr[0] = 98;
        // myArr[1] = 38;
        // myArr[2] = 28;
        // myArr[3] = 78;
        // myArr[4] = 58;

        // Define array values using the second method (preferred way)
        // This method initializes the array with predefined values directly.
        int[] myArr = {2, 55, 44, 88, 96};

        // Example of accessing a specific index (commented out)
        // System.out.println(myArr[4]); // Prints the element at index 4 (96)
        // int index = 4;
        // System.out.println(myArr[index]); // Also prints 96

        // Print all array elements using a while loop
        int index = 0; // Initialize index to start from the first element

        System.out.println("Printing all array elements:");

        // Iterate through the array until the end is reached
        while (index < myArr.length) {
            // Print the current array element at the given index
            System.out.println("Element at index " + index + ": " + myArr[index]);
            index++; // Move to the next index
        }
    }
}