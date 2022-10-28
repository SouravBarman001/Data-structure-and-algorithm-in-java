package data_structure.array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
//int [][] TwoD = new int[][]{
//        {1,2,3,4},
//        {2,4,6},
//        {1}
//};
       // System.out.println(TwoD[0].length);
        //System.out.println(TwoD.length);
//for (int i = 0 ; i<TwoD.length;i++){
//
//    for (int j = 0;j<TwoD[i].length;j++){
//        System.out.print(TwoD[i][j]);
//
//    }
//    System.out.print("\n");
//}

// User input of 2d array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row:");
        int row = sc.nextInt();
        System.out.println("Enter Column:");
        int column = sc.nextInt();

        int [][] userArray = new int[row][column];

        for (int i = 0 ; i<row;i++){
            for (int j = 0 ; j < column;j++){
                userArray[i][j] = sc.nextInt();
            }
            System.out.print("\n");
        }
        System.out.println("printing");
        for (int i = 0 ; i<row;i++){
            for (int j = 0 ; j <column;j++){
                System.out.print(userArray[i][j]+" ");
            }
            System.out.print("\n");
        }


   }
}
