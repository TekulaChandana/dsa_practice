public class FirstLastElement {

    // Bruteforce Approaach
    public static int[] bruteforce(int arr[], int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        return new int[] { first, last };
    }

    // Approach -1 With lower and upper bound concept ,Tc: 2O(logn)
    public static int lowerBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;

    }

    public static int upperBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;

    }

    public static int[] firstLastElementLU(int arr[], int target) {
        int lb = lowerBound(arr, target);
        if (lb == arr.length || arr[lb] != target) {
            return new int[] { -1, -1 };
        }
        int ub = upperBound(arr, target);
        return new int[] { lb, ub - 1 };
    }

    // Approach2 - without lower bound concept
    public static int firstElement(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastElement(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int[] firstLastElement(int arr[], int target) {
        int first = firstElement(arr, target);
        if (first == -1) {
            return new int[] { -1, -1 };
        } else {
            int last = lastElement(arr, target);
            return new int[] { first, last };
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 5, 8, 9, 11 };
        int target = 11;
        int nums[] = bruteforce(arr, target);
        System.out.println("[" + nums[0] + "," + nums[1] + "] ");
    }
}