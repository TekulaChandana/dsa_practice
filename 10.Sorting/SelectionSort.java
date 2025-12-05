public class SelectionSort {
  public static void selectionort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
      }
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 2, 28, 78, 23 };
    selectionort(arr);
    printArray(arr);
  }
}
