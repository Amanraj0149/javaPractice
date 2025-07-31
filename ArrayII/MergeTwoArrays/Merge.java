package ArrayII.MergeTwoArrays;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int arr1[] = { 5, 8, 9 };
        int arr2[] = { 4, 7, 10 };
        int merged[] = new int[arr1.length + arr2.length];

        // Copy elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        Arrays.sort(merged);
        System.out.println("Sorted merged array: " + Arrays.toString(merged));

    }
}
