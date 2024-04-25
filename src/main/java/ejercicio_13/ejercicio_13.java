package ejercicio_13;

public class ejercicio_13 {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int mid = low + (high - low) / 2;
        int pivot = medianOfThree(array[low], array[mid], array[high]);
        while (low <= high) {
            while (array[low] < pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }
            if (low <= high) {
                swap(array, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static int medianOfThree(int a, int b, int c) {
        if ((a < b && b < c) || (c < b && b < a)) {
            return b;
        } else if ((b < a && a < c) || (c < a && a < b)) {
            return a;
        } else {
            return c;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}