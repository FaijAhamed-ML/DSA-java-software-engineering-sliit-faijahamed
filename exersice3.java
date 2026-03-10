package dsalab2;
import java.util.Arrays;
public class exersice3 {
    public static void simulateInsertionSort(int[] A) {
        System.out.println("Initial Unsorted List: " + Arrays.toString(A));
        System.out.println("==================================================");

        // Start at index 1
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            System.out.println("Pass " + j + ": Extracting key [" + key + "]");
            boolean shiftOccurred = false;

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                System.out.println("  -> Shifted [" + A[i] + "] to the right (index " + (i + 1) + ")");
                i = i - 1;
                shiftOccurred = true;
            }

            A[i + 1] = key;

            if (shiftOccurred) {
                System.out.println("  -> Inserted key [" + key + "] at index " + (i + 1));
            } else {
                System.out.println("  -> No shifts needed. [" + key + "] stays at index " + (i + 1));
            }

            // Show the state of the array after this complete pass
            System.out.println("Array state: " + Arrays.toString(A));
            System.out.println("--------------------------------------------------");
        }

        System.out.println("Final Sorted List: " + Arrays.toString(A));
    }

    public static void main(String[] args) {
        // You can change these numbers to test different scenarios
        int[] numbers = {7, 3, 5, 2, 6};
        simulateInsertionSort(numbers);
    }
}
