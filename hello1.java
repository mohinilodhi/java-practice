import java.util.Scanner;
public class hello1 {
    public static void main(String[] args) {
        System.out.println("hello1 world");
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("your age is:" + age);

        int num1 = sc.nextInt();
        System.out.println("num1");

        int num2 = sc.nextInt();
        System.out.println("num2");
        
        int num3 = sc.nextInt();
        System.out.println("num3");

        int add = num1 + num2 + num3;
        System.out.println(add);
        
        sc.nextLine();


        String name= sc.nextLine();
        System.out.println("my name is :"+name);

        String caste = sc.nextLine();
        System.out.println("my caste is:"+caste);

        
}
}

