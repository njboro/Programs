import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
            System.out.println("Start : " + start);
            System.out.println("End : " + end);
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

        System.out.println("Values of reversed Array : " + Arrays.toString(arr));

    }
}
