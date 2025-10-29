public class MultilevelInheritance {
  public static void main(String[] args) {
    Dog doggy = new Dog();
    doggy.eat();
    doggy.color = "black";
    System.out.println(doggy.color);
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
  int legs;
}

class Dog extends Mammal {
  String breed;
}