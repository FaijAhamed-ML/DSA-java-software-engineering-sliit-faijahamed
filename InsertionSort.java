package dsalab2;

public class InsertionSort {
    public static void sortAscending(int[] A) {
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 4, 6, 1, 3};

        System.out.println("Original array:");
        printArray(numbers);

        sortAscending(numbers);

        System.out.println("\nSorted array (Ascending):");
        printArray(numbers);
    }

    // A simple helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
