public class BuySellStock {
  public static int buySellStock(int[] arr) {
    int bestBuy = arr[0];
    int maxProfit = Integer.MIN_VALUE;
    for (int i = 1; i < arr.length; i++) {
      if (bestBuy > arr[i]) {
        bestBuy = arr[i];
      } else {
        maxProfit = Math.max(maxProfit, arr[i] - bestBuy);
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int arr[] = { 7, 1, 5, 3, 6, 4 };
    System.out.println(buySellStock(arr));
  }
}
