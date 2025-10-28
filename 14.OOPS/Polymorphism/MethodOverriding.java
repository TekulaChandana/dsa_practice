public class MethodOverriding {
  public static void main(String[] args) {
    Horse h = new Horse();
    h.eat();
  }
}

class Animal {
  String color;

  void eat() {
    System.out.println("animal eats");
  }
}

class Horse extends Animal {
  void eat() {
    System.out.println("Horse eats");
  }
}