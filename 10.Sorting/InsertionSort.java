public class InsertionSort {
  public static void insertionSort(int arr[]) {
    int n = arr.length;
    int temp;
    for (int i = 1; i < n; i++) {
      temp = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > temp) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = temp;
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 2, 28, 78, 23 };
    insertionSort(arr);
    printArray(arr);
  }
}
