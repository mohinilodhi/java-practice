


class Animal{
    void sound(){
        System.out.println("Animal makes sound");

    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }

    void run(){
        System.out.println("Dog is running");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat is meow");
    }
}
public class student15{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}