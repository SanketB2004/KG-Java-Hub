public class twoDArray {
    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3} , {4,5,6} , {7,8,2} };// 1st Tarika 
        System.out.println(arr.length);

        int[][] myarr = new int[2][3]; // Dhusara Takika Array Define Karayacha

        myarr[0][0]=9;// inishelize

        int i = 0 ; // print karayacha tarika 1st array cha 
        
            while (i < arr.length) {
                int j = 0;
                while (j < arr[i].length) {
                    System.out.print(arr[i][j] + " ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }



    }

