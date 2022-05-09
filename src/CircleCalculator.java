public class CircleCalculator {
    public static void main(String[] args) {
        //create variables
        float pi = 3.14f;
        double circleRadius = 12.0;
        double circleDiameter;
        double circleCircumference;
        double circleArea;
        circleDiameter = 2*circleRadius;
        System.out.println(circleDiameter);
        circleCircumference = 2*pi*circleRadius;
        System.out.println(circleCircumference);
        circleArea = pi*circleRadius;
        System.out.println(circleArea);
    }
}
