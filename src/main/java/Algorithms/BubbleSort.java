package Algorithms;

import java.util.Arrays;

public class BubbleSort {


    public static int[] bubbleSort(int[] arr) {
        int length = arr.length;
        // loop to access each array element
        for (int i = 0; i < length - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < length - i - 1; j++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (arr[j] > arr[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        return arr;
    }

    public static int[] optimiseBubbleSort(int[] arr) {
        int length = arr.length;
        // loop to access each array element
        for (int i = 0; i < length - 1; i++) {
            boolean swapped = false;

            // loop to compare array elements
            for (int j = 0; j < length - i - 1; j++) {

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (arr[j] > arr[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] data = {-2, 45, 0, 11, -9};

        System.out.println(Arrays.toString(optimiseBubbleSort(data)));
    }

/*    Time Complexity
    Best	O(n)
    Worst	O(n2)
    Average	O(n2)
    Space Complexity	O(1)
    Stability	Yes*/
}
