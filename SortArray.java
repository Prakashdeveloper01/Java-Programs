import java.util.Array;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {45, 35, 56, 67, 78, 89, 78, 12, 20};

              Array.sort(arr);

        System.out.println("Sorted array: " + Array.toString(arr));
    }
}
