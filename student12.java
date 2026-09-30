//constructor + inheritance
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int marks;

    Student(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }

    void showStudent() {
        System.out.println("Marks: " + marks);
    }
}

public class student12 {
    public static void main(String[] args) {

        Student s1 = new Student("Mohini", 20, 85);

        s1.showPerson();
        s1.showStudent();
    }
}