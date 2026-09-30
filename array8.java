public class array8 {
    public static void main ( String [] args){

        int [] arr = { 1,2,3,40,5};

        

        


        for(int i = 0; i < arr.length; i++){
            if(arr[i]>10){
            System.out.println(arr[i]);
        }
    }


    int[] numbers = {10,20,30,40,50};

    int[] newnum = new int[5];

    for(int i = 0;i<numbers.length; i++){
        newnum[i] = arr[i];

    }
    newnum[5] = 50;

     

    int[] array = {10, 20, 30, 40, 50};

int deleteIndex = 2;

for(int i = deleteIndex; i < array.length - 1; i++) {
    array[i] = array[i + 1];
}

for(int i = 0; i < array.length - 1; i++) {
    System.out.println(array[i]);
}








    }
    
}
