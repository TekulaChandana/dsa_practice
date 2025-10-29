public class MethodOverloading {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    calc.sum(2, 3);
    calc.sum((float) 2.4, (float) 1.2);
    calc.sum(1, 3, 4);

  }
}

class Calculator {

  void sum(int a, int b) {
    System.out.println(a + b);
  }

  void sum(float a, float b) {
    System.out.println(a + b);
  }

  void sum(int a, int b, int c) {
    System.out.println(a + b + c);
  }

}
