public class MaxSubArray {

  // BruteForce Approach
  public static int bruteForce(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        currSum = 0;
        for (int k = i; k <= j; k++) {
          currSum += arr[k];
        }

        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    return maxSum;
  }

  // PrefixSum Approach

  public static int prefixSum(int arr[]) {
    int prefix[] = new int[arr.length];
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    // prefix array
    prefix[0] = arr[0];
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }

    // maxSum
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    return maxSum;
  }

  // Kadane's Algorithm

  public static int kadanesAlgo(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    for (int i = 0; i < arr.length; i++) {
      currSum += arr[i];
      if (maxSum < currSum) {
        maxSum = currSum;
      }
      if (currSum < 0) {
        currSum = 0;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int arr[] = { 1, -2, 7, 6, 5, -4 };
    System.out.println("MaxSum from Bruteforce Approach is:" + bruteForce(arr));
    System.out.println("MaxSum from PrefixSum Approach is:" + prefixSum(arr));
    System.out.println("MaxSum from Kadane's Algorithm is:" + kadanesAlgo(arr));

  }
}
