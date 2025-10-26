public class Hierarchial {
  public static void main(String[] args) {
    Mammal m = new Mammal();
    m.eat();

  }
}

// Base class
class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breathe() {
    System.out.println("breathes");
  }
}

class Mammal extends Animal {
  void walk() {
    System.out.println("walks");
  }
}

class Fish extends Animal {
  void swim() {
    System.out.println("swim");
  }
}

class Bird extends Animal {
  void fly() {
    System.out.println("fly");
  }
}
