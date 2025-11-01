public class LinearSearch {
  public static int linearSearch(int[] nums, int key) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 17, 89, 23, 45, 65 };
    int index = linearSearch(nums, 24);
    if (index == -1) {
      System.out.println("Key not found");
    } else {
      System.out.println("Key found at index " + index);
    }
  }
}
