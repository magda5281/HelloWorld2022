import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What times table would you like?: ");
        int timesTable = reader.nextInt();
        int result;
        for (int i =0; i<=12; i++){
            result = i*timesTable;
            System.out.println(i+"*"+timesTable+ " = " + result);
        }

    }
}
