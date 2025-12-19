public class BinarySearch {
  public static int binarySearchI(int arr[], int start, int end, int key) {

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

  public static int binarySearchR(int arr[], int start, int end, int key) {
    if (start > end) {
      return -1;
    }
    int mid = start + (end - start) / 2;
    if (arr[mid] == key) {
      return mid;
    } else if (arr[mid] < key) {
      return binarySearchR(arr, mid + 1, end, key);
    } else {
      return binarySearchR(arr, start, mid - 1, key);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 20, 54, 76, 89, 204 };
    int key = 76;
    int index = binarySearchR(arr, 0, arr.length - 1, key);
    if (index != -1) {
      System.out.println("Key found at index:" + index);
    } else {
      System.out.println("Key not found");
    }
  }
}
