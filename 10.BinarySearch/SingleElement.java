public class SingleElement {
    // Bruteforce Approach
    public static int bruteforce1(int arr[]) {
        int n = arr.length;
        if (arr[0] != arr[1]) {
            return arr[0];
        } else if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        } else {
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // bruteforce - i= i+2;
    public static int bruteforce2(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return arr[n - 1];
    }

    // Using bitmanipulation - O(n)
    public static int bitmanipulation(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }

        return result;
    }

    public static int singleElement(int arr[]) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 1;
        int high = arr.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid - 1] != arr[mid] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            // if (mid % 2 != 0) {
            // if (arr[mid] == arr[mid - 1]) {
            // low = mid + 1;
            // } else {
            // high = mid - 1;
            // }
            // } else {
            // if (arr[mid] == arr[mid + 1]) {
            // low = mid + 1;
            // } else {
            // high = mid - 1;
            // }
            // }

            if ((mid % 2 != 0 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        System.out.println(singleElement(arr));
    }

}
