package Algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] data = {20, 12, 10, 15, 2,-9,-1,0};
        System.out.println(Arrays.toString(selectionSort(data)));
    }

  /*  Time Complexity
    Best	O(n2)
    Worst	O(n2)
    Average	O(n2)
    Space Complexity	O(1)
    Stability	No*/

}
