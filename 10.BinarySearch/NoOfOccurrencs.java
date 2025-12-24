public class NoOfOccurrencs {
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

    public static int noOfOccurrencs(int[] arr, int target) {
        int ans[] = firstLastElement(arr, target);
        if (ans[0] == -1) {
            return 0;
        }
        return ans[1] - ans[0] + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 5, 8, 9, 11 };
        int target = 11;
        System.out.println("No of Occurrences is:" + noOfOccurrencs(arr, target));
    }
}
