public class QuickSort {

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pIdx = partitionF(arr, low, high);
            // int pIdx = partitionL(arr, low, high);
            quickSort(arr, low, pIdx - 1);
            quickSort(arr, pIdx + 1, high);
        }
    }

    // first element is taken as pivot
    public static int partitionF(int arr[], int low, int high) {
        int start = low;
        int end = high;
        int pivot = arr[start];
        while (start < end) {
            while (start <= high && arr[start] <= pivot) {
                start++;
            }
            while (end >= low && arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }

        swap(arr, low, end);
        return end;
    }

    // last Element is taken as pivot
    public static int partitionL(int arr[], int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        if (low < high) {
            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArrays(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 2, 3, 5, 1 };
        quickSort(arr, 0, arr.length - 1);
        printArrays(arr);
    }
}
