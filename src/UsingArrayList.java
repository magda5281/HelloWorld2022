import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {
    public static void main(String[] args) {
        int [] arr1 = new int[10];
        String [] arr2 = new String[2];

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(2);
        myList.add(1,3);
        myList.add(5);
        myList.add(9);

        Collections.sort(myList);
        System.out.println(myList);


    }
}
