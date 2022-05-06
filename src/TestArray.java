public class TestArray {
    public static void main(String[] args) {


//Initialise an integer variable called sum set to 0
        int sum = 0;

//Create and initialise an integer array called numbers with a size of 10.
//Fill the array with 10 integer values of your choice
        int [] numbers = {2,3,5,6,7,20,34,200,100,25,40};
//•Write the code to sum the values within numbers array and output the result via the sum variable.

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of all numbers is: " + sum);
//Now calculate the average (using a double variable titled average) and output this result also

        double average = sum/numbers.length;
        System.out.println("The average of all numbers is: " + average);

    }
}
