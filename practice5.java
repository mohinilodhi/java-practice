import java.util.Scanner;

public class practice5{
    public static void main(String[]args){

        int age;
        System.out.println("enetr your age: ");
        Scanner sc = new Scanner (System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("you are expericed");
        }
        else if(age>38){
            System.out.println("not you are adult");

        }
        else if(age>18){
            System.out.println("you are now eligible for vote");
        }
        else{
            System.out.println("you are not men nowyou are not eligible  for anthing");
        }
        


        //switch case

        int year;
        System.out.println("enter your current year");
        Scanner Sc = new Scanner(System.in);
        year = sc.nextInt();
        
        switch(year){
            case 2024:
                System.out.print("outside");
                break;

            case 2025:
                System.out.println("inside");
                break;

            case 2026:
                System.out.println("placement");
                break;
            case 2029:
                System.out.println("passing year ");
                break;
            default:
                System.out.println("Enjoy your life");

        }
        System.out.println("thanks for using this code");





int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");

    case 2:
        System.out.println("Tuesday");

    case 3:
        System.out.println("Wednesday");

    default:
        System.out.println("Invalid");
}






























    


        int salary = 20000;
        if(salary != 20000){
            System.out.println("yes this both are equal");

        }

        boolean a = true;
        boolean b = false;

        if(a || b){
            System.out.println("yes");
                }
        else{
            System.out.println("no");
            
        }



        }


    }

