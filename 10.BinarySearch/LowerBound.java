public class LowerBound {

    public static int lowerBoundV1(int arr[], int target) {
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

    // without using ans variable
    public static int lowerBoundV2(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;

    }

    public static int lowerBoundV3(int arr[], int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5, 8, 8, 9, 10, 11 };
        System.out.println(lowerBoundV1(arr, 9));
    }
}
