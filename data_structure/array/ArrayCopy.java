package data_structure.array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
//    int [] arr = new int[]{1,2,4,5};
//    int [] copyArr = arr.clone();
//    arr[0] = -4;
//
//    for (int i : copyArr){
//        System.out.print(i);
//    }


        int [] arrayOne = new int []{3,4,5,6};
        int [] arrayTwo = new int[4];

        for (int i=0 ; i<arrayOne.length ; i++){
            arrayTwo[i] = arrayOne[i];
        }

        for (int a : arrayTwo){
            System.out.print(a);
        }
      //  System.out.print(Arrays.toString(arrayTwo));

    }
}
