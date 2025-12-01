public class PairsInArray {
  public static int pairsInArray(int arr[]) {
    int totalPairs = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        totalPairs++;
        System.out.print("(" + arr[i] + "," + arr[j] + ")");
      }
      System.out.println();
    }
    return totalPairs;

  }

  public static void main(String[] args) {
    int[] arr = { 2, 4, 6, 8, 10 };
    System.out.println("Total pairs is :" + pairsInArray(arr));
  }
}
