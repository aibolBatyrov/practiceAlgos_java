package algos.data_stucture;
import algos.BaseClase;

public class Array_LeftRotation extends BaseClase {
    public Array_LeftRotation() {
        int[] arr = {1, 2, 3, 4, 5};

        print(arr, "before: ");
        arr = rotate(arr, 2);
        print(arr, "after: ");
    }

    public int[] rotate(int[] arr, int k) {
        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rotated[(i + arr.length - k) % arr.length] = arr[i];
        return rotated;
    }


    static void rotate2(int[] arr, int k) {
        k %= arr.length;
        int a = arr.length - k;

        reverse(arr, 0, arr.length - 1); //  here is change
        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);


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
