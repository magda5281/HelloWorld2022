public class Task1 {
    public static void main(String[] args) {

        //first for loop is for rows
        for (int i = 0; i < 7; i++) {
            // print spaces
            for (int j = 0; j < 7 - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k < (2 * i + 1); k++){
                System.out.print("*");
                }
            System.out.println();
            if (i==6){
                System.out.print("       *");
            }
        }
    }
}
