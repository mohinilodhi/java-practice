public class practice7 {
    public static void main(String[] args) {
         //declaration memory allocation
         

        int[] numbers = {5, 10, 15, 20, 25};

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] > 10) {
                System.out.println(numbers[i]);
        

            }
        }

               int[] num = {8, 25, 14, 42, 19};

        int max = num[0];

        for(int i = 1; i < num.length; i++) {

            if(num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("Maximum = " + max);




        int[] number  = {20, 8, 15, 4, 11};

        int min = number[0];

        for(int i = 1; i < number.length; i++) {

            if(number[i] < min) {
                min = number[i];
            }
        }

        System.out.println("Minimum = " + min);

        int[] numb = {5, 15, 25, 35};

        for(int i = numb.length - 1; i >= 0; i--) {
            System.out.println(numb[i]);
        }


        int[] age = {10, 20, 40, 50};
          int target = 30;


         boolean found = false; 

       for(int i = 0; i < age.length; i++) {
         if(age[i] == target) {
            found = true;
           System.out.println("Found at index " + i);
             break;
    }
}
        if(found == false) {
        System.out.println("Not Found");
}





    }
}







        
    


       


        





        







    
