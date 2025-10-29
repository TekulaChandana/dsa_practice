public class AbstractionConst {
  public static void main(String[] args) {

    Mustang m = new Mustang();
    m.eat();
    m.walk();
    System.out.println(m.color);
    m.changeColor("black");
    System.out.println(m.color);
  }
}

abstract class Animal {
  String color;

  Animal() {
    color = "brown";
    System.out.println("animal construcor is called");
  }

  void eat() {
    System.out.println("animal eats");
  }

  abstract void walk();
}

class Horse extends Animal {

  Horse() {
    System.out.println("Horse constructor is called");
  }

  void walk() {
    System.out.println("Horse walks on 4 legs");
  }
}

class Mustang extends Horse {
  Mustang() {
    System.out.println("Mustang constructor is called");
  }

  void changeColor(String color) {
    this.color = color;
  }
}

class Chicken extends Animal {
  Chicken() {
    System.out.println("Constructor is called");
  }

  void walk() {
    System.out.println("Chicken walks on 2 legs");
  }
}