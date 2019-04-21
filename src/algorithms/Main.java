package algorithms;


/**
 * Michael Paul McAuliffe -- April 2019
 **/
public class Main {

    public static void main(String[] args) {

        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

        // for printing purposes only
        for (int num: intArray) { System.out.print(num + "   "); }
        System.out.print("\n");


        countingSort(intArray, 1, 10);


        // for printing purposes only
        for (int num: intArray) { System.out.print(num + "   "); }
        System.out.print("\n");
    }

/**
 * COUNTING SORT ALGORITHM
 **/
    public static void countingSort(int[] input, int min, int max) {

        /**
         *      --int[] countArray      -- this array is used to count the occurrence of each individual value
         *                                      in the input array
         **/
        int[] countArray = new int[(max - min) + 1];

        /**     { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 }    **/

        /**
         *      FOR LOOP
         *          This loop traverses the input array using the value of each element and incrementing the
         *          corresponding value in the index of countArray[].
         **/
        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        /**
         *      FOR LOOP / WHILE LOOP
         *          This loop traverses the countArray[] and redistributes the corresponding values to the
         *          input array.
         **/
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
/** END **/
}
