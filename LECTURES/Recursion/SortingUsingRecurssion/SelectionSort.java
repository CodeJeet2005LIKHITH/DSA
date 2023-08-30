package LECTURES.Recursion.SortingUsingRecurssion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Selection_Sort(arr, 0, arr.length , 0);
        System.out.println(Arrays.toString(arr));

    }

    private static void Selection_Sort(int[] arr, int start, int end, int Maximum) {
        if (end == 0) {
            return;
        }
        if (start < end) {
            if (arr[start] > arr[Maximum]) {
                Selection_Sort(arr, ++start, end, start);
            } else {
                Selection_Sort(arr, ++start, end, Maximum);
            }
        } else {
            int temp = arr[end-1];
            arr[end-1] = arr[Maximum];
            arr[Maximum] = temp;
            Selection_Sort(arr, 0, end-1, 0);
            // dhfjhfiop
        }

    }
}
