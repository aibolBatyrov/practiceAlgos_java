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


}
