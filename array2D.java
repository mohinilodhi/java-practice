public class array2D {
    public static void main( String[] args){
        int[][] arr = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};


    System.out.println(arr[1][2]);
    System.out.println(arr[2][1]);
    System.out.println(arr.length);
    System.out.println(arr[0].length);



    for(int i = 0; i < arr.length; i++) {

    for(int j = 0; j < arr[i].length; j++) {

        System.out.println(arr[i][j]);

    }
}


int[][] array = {
    {10, 20},
    {30, 40}
};
    


for(int i = 0; i<array.length;i++){
    for(int j = 0;j < array[i].length; j ++){



        System.out.println(array[i][j]);
    }
}

int sum = 0;

for(int i = 0; i < arr.length; i++) {
    for(int j = 0; j < arr[i].length; j++) {
        sum = sum + arr[i][j];
    }
}

System.out.println(sum);

int[][] ar = {
    {10, 25, 30},
    {15, 40, 5}
};

for(int i = 0; i < ar.length; i++) {
    for(int j = 0; j < ar[i].length; j++) {
        if(ar[i][j] > 20) {
            System.out.println(ar[i][j]);
        }
    }

}

    }
    
}
