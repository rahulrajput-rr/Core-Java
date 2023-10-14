public class ArrayPractice {

    public static void main(String[] args) {

        /*
         * A => is the refereance of an array
         * new => onject is created in heap
         * int[10] = > here is object is creating
         */
        int A[] = new int[10];

        // ANother method to created array
        int B[] = { 1, 2, 3, 4, 5 };

        // just declare referance
        // int C[];
        // to that referance than assign array of object size of 10
        // C = new int[10];

        // another methods

        /*
         * int[] D = new int[5];
         * int []E = new int[5];
         */

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        // for (int i = 0; i < B.length; i++) {
        // System.out.println(B[i]);
        // }

        // for (int i = 0; i < B.length; i++) {
        // System.out.println(B[i]++);
        // }
        // for (int x : B) {
        // System.out.println(x);
        // }

        // only print with the helop of loop
        System.out.println(B.length);
    }
}