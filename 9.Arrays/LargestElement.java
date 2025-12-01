public class LargestElement {

  public static int largestElement(int arr[]) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Array must not be null or empty");
    }

    int largest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (largest < arr[i]) {
        largest = arr[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {
    int arr[] = null;
    System.out.println(largestElement(arr));
  }
}