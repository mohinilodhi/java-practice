class Animal{
    void sound(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Dog");
    }
}

public class student14{
    public static void main(String []args){
           Dog d1 = new Dog();
           d1.sound();


           
    }
}