import java.util.Random;


public class Duplicates {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[12];
        Random random = new Random();

        // WIP TO DO: refactor to replace with one function/class not to copy the code
//        for(int i=0; i< array1.length; i++){
//            int randomNumber = random.nextInt(20)+1;
//            array1[i]= randomNumber;
//        }

        fillArraysWithRandomNumbers(array1);

        for (int j : array1) {
            System.out.print(j + " ");

        }
        System.out.println( "\r\n");

//        for(int i=0; i< array2.length; i++){
//              int randomNumber = random.nextInt(20)+1;
//            array2[i]= randomNumber;
//        }

        fillArraysWithRandomNumbers(array2);

        for(int j:array2){
            System.out.print(j +" ");
        }
        System.out.println( "\r\n");
        int[] duplicate = new int[array1.length];

        for(int i=0; i<array1.length; i++){
            for (int k : array2) {
                if (array1[i] == k) {
                    int duplicateNumber = array1[i];
                    duplicate[i] += duplicateNumber;
//                    System.out.println("Array1 contains duplicate number: " +duplicate[i]);
                }
            }
        }

        for (int j : duplicate) {
            if (j != 0) {
                System.out.println("Array1 contains duplicate number: " + j);
            }

        }

    }

    public static int[] fillArraysWithRandomNumbers(int[] array){
        Random random = new Random();
        for(int i=0; i< array.length; i++){
            int randomNumber = random.nextInt(20)+1;
            array[i]= randomNumber;
        }

        return array;
    }
}
