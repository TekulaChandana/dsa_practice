import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

  // For ascending order sorting
  public static void ascendingIBS(int arr1[]) {
    // Arrays.sort(arr1);
    Arrays.sort(arr1, 0, 2);
  }

  // For descending order sorting
  public static void descendingIBS(Integer arr2[]) {
    // Arrays.sort(arr2, Collections.reverseOrder());
    Arrays.sort(arr2, 0, 2, Collections.reverseOrder());
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void printArray(Integer arr[]) {
    for (Integer i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr1[] = { 45, 23, 89, 65, 12 };
    Integer arr2[] = { 13, 24, 45, 23, 7 };
    ascendingIBS(arr1);
    System.out.println("Ascending Order:");
    printArray(arr1);
    System.out.println("Descending Order");
    descendingIBS(arr2);
    printArray(arr2);
  }
}
