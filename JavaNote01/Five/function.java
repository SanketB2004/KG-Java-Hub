public class function {
    /**
     * Fuction Class
     * 
     * @param ar();gs
     */
    public static void main(String[] args) {

        goodNight();

        starpattern();

    }

    public static void goodNight() {

        System.out.println("Good Night");

    }

    public static void starpattern() {

        int row = 0;
        while (row < 30) {
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

}
