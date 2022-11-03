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

        boolean prime[] = new boolean[n+1];

        for (int i=2;i<=n;i++){
            prime[i]=true;  // initially marked every number as prime
        }

       // int num = (int) Math.sqrt(n);

        for (int i = 2; i <=Math.sqrt(n) ; i++){
          if (prime[i]){
              for (int j=i;j*i<=n;j++){
                  prime[j*i] = false;
              }
          }
        }
        int count = 0;
        for (int i = 2; i <= n; i++){
            if (prime[i]){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("Count = "+count);





    }
}
