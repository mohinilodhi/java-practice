class child{
    String name;
    int age;



    child(String name,int age){
        this.name = name;
        this.age = age;


    }
}

    
public class student {
    public static void main(String[]args){
        child c1 = new child("mohini",90);
        System.out.println(c1.name);
        System.out.println(c1.age);


    }
    
}
