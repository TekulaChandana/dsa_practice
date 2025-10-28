public class ShallowCopy {
  public static void main(String[] args) {
    Student s1 = new Student("Chandana", 123, 25);
    Student s2 = new Student(s1); // shallow copy

    // Change one mark in s1 to see the effect
    s1.marks[0] = 50;

    System.out.println("S1 Info:");
    s1.displayInfo();

    System.out.println("S2 Info:");
    s2.displayInfo();
  }
}

class Student {
  String name;
  int rollno;
  int age;
  int[] marks;

  // Shallow copy constructor
  Student(Student s1) {
    this.name = s1.name;
    this.rollno = s1.rollno;
    this.age = s1.age;
    this.marks = s1.marks;
  }

  // Parameterized constructor
  Student(String name, int rollno, int age) {
    this.name = name;
    this.rollno = rollno;
    this.age = age;
    this.marks = new int[3];
    marks[0] = 90;
    marks[1] = 100;
    marks[2] = 89;
  }

  void displayInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Roll No: " + this.rollno);
    System.out.println("Age: " + this.age);
    System.out.print("Marks: ");
    for (int mark : marks) {
      System.out.print(mark + " ");
    }
    System.out.println("\n");
  }
}
