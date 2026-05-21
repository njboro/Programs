import java.util.Arrays;

public class FindSecodLargest {
    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};

        // Initializing variables to hold the largest and second largest elements
        int largest = findLargest(array);
        int secondLargest = Integer.MIN_VALUE;



        // Iterating through the array to find the largest and second largest elements
        for (int num : array) {
            /*if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num; // Update largest
            } else */if (num > secondLargest && num != largest) {
                secondLargest = num; // Update second largest if necessary
            }
        }

        // Checking if we found a valid second largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }

    static int findLargest(int[] array) {
        System.out.println(Arrays.toString(array));
        int largest = array[0];
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
}

