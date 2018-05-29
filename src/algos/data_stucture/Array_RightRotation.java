package algos.data_stucture;

import algos.BaseClase;

public class Array_RightRotation extends BaseClase {
    public Array_RightRotation() {
        int[] arr = {1, 2, 3, 4, 5};

        print(arr, "before: ");
        rotateToRight(arr, 2);
        print(arr, "after: ");
    }


    static void rotateToRight(int[] arr, int k) {
        k %= arr.length;
        int a = arr.length - k;


        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1); // here is chnage

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
