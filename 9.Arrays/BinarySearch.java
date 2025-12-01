public class BinarySearch {
  public static int binarySearch(int arr[], int key) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] < key) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 20, 54, 76, 89, 204 };
    int key = 76;
    int index = binarySearch(arr, key);
    if (index != -1) {
      System.out.println("Key found at index:" + index);
    } else {
      System.out.println("Key not found");
    }
  }
}
