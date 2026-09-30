//overloading 


class Calculator{
    int add(int a,int b){
        return a+b;

    }
    int add(int a,int b,int c){
        return a+b+c;

    }
    int subtract(int p,int q){
        return p-q;
    }
}
public class student13{
    public static void main(String[]args){
        Calculator c1 = new Calculator();
        System.out.println(c1.add(3,4));
        System.out.println(c1.add(2,3,4));
        System.out.println(c1.subtract(7,5));
    }
}
