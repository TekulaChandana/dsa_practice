public class Constructors {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Chandana");

  }
}

class Student {
  String name;
  int rollno;
  int age;

  // No-argument(default) constructor
  Student() {
    System.out.println("Default constructor called");
  }

  // Parametrized constructor
  Student(String name) {
    this.name = name;
  }
}