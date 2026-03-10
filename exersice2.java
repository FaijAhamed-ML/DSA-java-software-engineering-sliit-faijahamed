package dsalab2;

public class exersice2 {
    public static void sortAscendingAndCountShifts(int[] A) {
        int shiftCount = 0;

        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                shiftCount++;
                i = i - 1;
            }
            A[i + 1] = key;
        }
        System.out.println("Total number of shifts: " + shiftCount);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 4, 6, 1, 3};

        System.out.println("Original array:");
        printArray(numbers);

        System.out.println("\nSorting array...");
        sortAscendingAndCountShifts(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
