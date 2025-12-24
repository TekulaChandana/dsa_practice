public class FloorCeil {

    public static int floor(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int ceil(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5, 7 };
        System.out.println("Floor of an element 3 is:" + floor(arr, 3));
        System.out.println("Ceil of an element 3 is:" + ceil(arr, 3));
    }
}
