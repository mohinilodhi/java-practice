import java.util.Scanner;

public class practice4 {
    public static void main(String[]args){
        String name;
        name = new String("mohini");
        System.out.println(name);



          String word = "Programming";

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(9));

        //replace with this 
        

        String wor = "banana";

        System.out.println(wor.replace('a', 'o'));
        System.out.println(wor.replace("banana", "apple"));
    
    
        String nickname = "harry";
        System.out.println("this is my name from the dictionary:" + nickname);

        //normal form of string
        String a = "prachi patel";
        System.out.println(a);


        //length
        int value = name.length();
        System.out.println(value);

        //lowercase

        String lstring = name.toLowerCase();
        System.out.println(value);

        //uppercase

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        //trim
         
        String mname = "       manya           ";
        String result = mname.trim();
        System.out.println(result);


        //substring
        System.out.println(name.substring(3));
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));




        //this is use for takiing the input from the user
        Scanner sc = new Scanner(System.in);
        
        String caste = sc.next();
        System.out.println(caste);

    








    }
}
