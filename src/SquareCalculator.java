
import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        double width = 13.5;
        double height = 25.3;
        double perimeter;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter width: ");
        width=Double.parseDouble(input.nextLine());
        System.out.println("Enter height: ");
        height=Double.parseDouble(input.nextLine());

        System.out.println(width + ", " + height);
        perimeter = (width+height)*2;
        System.out.println(perimeter);
        area = width*height;
        System.out.println(area);


    }
}
