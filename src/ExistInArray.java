import java.util.Scanner;
public class ExistInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 6, 5, 10, 8};
        int number;
        boolean found = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose the number:");
        number = input.nextInt();

//        while (!found) {
            for (int i = 0; i < array.length; i++) {
                if (number == array[i]) {
                    found = true;
                    System.out.println("Number " + number + " found in array["+ i + "]");
                }
            }
            if(!found){
                System.out.println("Number" + number + " was not found in array");
//                found = true;
            }
//        }

    }
}