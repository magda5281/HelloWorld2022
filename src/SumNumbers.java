import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int sumTotal=0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        while(sumTo!=0){
            sumTotal +=sumTo;
            sumTo = sumTo-1;
        }
        System.out.println(sumTotal);
    }
}
