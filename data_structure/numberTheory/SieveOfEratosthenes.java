package data_structure.numberTheory;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int arrSize = sc.nextInt(); // 30

        sieveFunction(arrSize);







    }

    private static void sieveFunction(int n) {

        int sieveArray[] = new int[30];

        for (int i=0;i<sieveArray.length;i++){
            sieveArray[i]=0;
        }

        for (int i=2;i<n;i++){
            if (sieveArray[i] == 0){
                for (int j=i*i;j<n;j=j+i){
                    sieveArray[i] = 1;
                }
            }
        }

        for (int i=2;i<n;i++){
            if (sieveArray[i]==0){
                System.out.print(i);
                System.out.println(",");
            }
        }

    }
}
