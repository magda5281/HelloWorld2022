import java.util.Random;
import java.util.Arrays;

public class MaxandMin {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int num = rand.nextInt(10) + 1;
            array[i] = num;
        }
        Arrays.sort(array);
        for (int j : array) {
            System.out.println(j);
        }


        System.out.println("Minimum value of the array is: " + array[0]);
        System.out.println("Maximum value of the array is: " + array[array.length - 1]);

        System.out.println("-----------------------------------------------------");

//        or

        int minNum = array[0];
        int maxNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= minNum) {
                minNum = array[i];
            }
        }
        System.out.println("Min number is: " + minNum);

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= maxNum) {
                maxNum = array[i];
            }
        }
        System.out.println("Max number is: " + maxNum);

    }}

//or

