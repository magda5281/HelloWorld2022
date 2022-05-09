import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
//        char[]  letters = new char[];
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a string: ");
        char [] letters = reader.nextLine().toCharArray();

        printArray(letters);
        System.out.print("Reversed array is \n");
        reverseArray(letters, 0, letters.length-1);

    }

    static  void printArray(char arr[]){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void reverseArray(char arr[], int start, int end){
//        char temp;
//        while(start<end){
//            temp = arr[start];
//            arr[start]=arr[end];
//            arr[end ]= temp;
//            start++;
//            end--;
//        }

//        for(int i =arr.length-1; i; i-- ){
//            System.out.print(arr[i]);
//        }
        int i = arr.length-1;
        while(!(i<0)){
            System.out.print(arr[i]);
            i--;
        }

    }
}
