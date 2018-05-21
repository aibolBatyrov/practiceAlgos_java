package algos;

public class BaseClase {
    protected void print(int[] arr, String message){
        System.out.println("\n"+message);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
