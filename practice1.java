import java.util.Scanner;
public class practice1 {
    public static void main(String[]args) {
        System.out.println("helo world");


        int a = 89;
        int b = 78;
        int c = 89;
        int sum = a+b+c;
        System.out.println(sum);

        System.out.println("welcome to y new programming ");
        float subject1 = 45;
        float subject2 = 56;
        float subject3 = 78;
        float cgpa = (subject1+subject2+subject3)/30;
        System.out.println(cgpa);

        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());


        System.out.println("what is your name");
            String name = sc.next();
            System.out.println("hello" + name + " have a good day");
        

    }
}
