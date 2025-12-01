public class ReverseArray {
  public static int[] reverseArray(int arr[]) {
    int n = arr.length;
    int temp[] = new int[n];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = arr[i];
    }

    for (int i = 0; i < n / 2; i++) { // TC-O(n)
      int swap = temp[i];
      temp[i] = temp[n - i - 1];
      temp[n - i - 1] = swap;
    }
    return temp;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 45, 23, 61, 15 };
    int temp[] = reverseArray(arr);
    for (int i = 0; i < temp.length; i++) {
      System.out.println(temp[i]);
    }

  }
}
