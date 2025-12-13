public class MergeSort {
    public static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge1(arr, start, mid, end);
            // merge2(arr, start, mid, end);
        }
    }

    // merge -best and memory efficient

    public static void merge1(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = start; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }

    // merge -2nd way
    public static void merge2(int arr[], int start, int mid, int end) {
        int temp[] = new int[arr.length];
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (i = start; i <= end; i++) {
            arr[i] = temp[i];
        }
    }

    public static void printArrays(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 6, 2, 1 };
        mergeSort(arr, 0, arr.length - 1);
        printArrays(arr);
    }
}