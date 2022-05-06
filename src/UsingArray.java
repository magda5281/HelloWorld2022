public class UsingArray {
    public static void main(String[] args) {

        // one dimenssional array
        int[]myList = new int[10];
        int[] arr1 = {1,2,3,4,5,6,8,10,123,256};
//
//        System.out.println(arr1);
//print all the array elements
//        for ( int i = 0; i < arr1.length; i++ ){
//            System.out.println(arr1[i] + " ");
//        }
//
//        for (int j : arr1) {
//            System.out.println(j + " ");
//        }

        for (int i: arr1){
            System.out.println(i);
        };

        // two-dimensional array firs row then column

        int[][] intArray = new int[3][4];

        int[][] a = {{1, -2, 3}, {-4, -5, 6, 9}, {7}};

//        for (int i = 0; i < a.length; i++) {
//            System.out.println("-----------");
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println(a[i][j]);
//
//            }
//        }

        for (int[] i : a) {
            System.out.println("-----------");
            for (int j : i) {
                System.out.println(j);

            }
        }




    }
}
