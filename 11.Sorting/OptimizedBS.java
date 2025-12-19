public class OptimizedBS {
  public static void optimizedBS(int arr[]) {
    int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int swap = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = swap;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 3, 2, 76, 23, 15 };
    optimizedBS(arr);
    printArray(arr);
  }
}
