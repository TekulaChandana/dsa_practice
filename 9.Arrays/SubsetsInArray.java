public class SubsetsInArray {
  public static int subsetsInArray(int arr[]) {
    int totalSubsets = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        System.out.print("[");
        totalSubsets++;
        for (int k = i; k <= j; k++) {
          System.out.print(arr[k]);
          if (k < j) {
            System.out.print(",");
          }
        }
        System.out.print("]");
      }
      System.out.println();
    }
    return totalSubsets;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 5, 8, 10 };
    System.out.println("Total subsets in an array is:" + subsetsInArray(arr));
  }
}
