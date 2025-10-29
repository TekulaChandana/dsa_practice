public class Constructors {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Chandana");
    s2.rollno = 132;
    s2.age = 25;
    Student s3 = new Student(s2);
    s3.printInfo();

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

  // Copy Constructor
  Student(Student s2) {
    this.name = s2.name;
    this.rollno = s2.rollno;
    this.age = s2.age;
  }

  void printInfo() {
    System.out.println(this.name);
    System.out.println(this.rollno);
    System.out.println(this.age);
  }
}