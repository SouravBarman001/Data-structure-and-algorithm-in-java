package data_structure.array;

import java.util.Scanner;

public class ArrayOne {

    public static void main(String[] args) {
//        int a[] = new int[]{10,20,40,11};


         int [] arr = insertValue();
         displayValue(arr);

    }

    private static int[] insertValue() {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            System.out.println("input value:");
            int v = sc.nextInt();
            a[i] = v;

        }
        return a;
    }

    private static void displayValue(int []a) {
        for (int i :  a){
            System.out.println(i);
        }

    }
}
