public class Demo {

  public static void update(int[] arr, int a) {
    a = 20;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + 1;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int a = 5;
    update(arr, a);
    System.out.println("Value of a is:" + a);
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Element " + i + " is " + arr[i]);
    }
  }

}
