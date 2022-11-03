package data_structure.numberTheory;

import java.io.PrintStream;
import java.util.LinkedList;

public class Kth_Prime_number {

    private static void sieveFunction(int n,int k) {

        boolean prime[] = new boolean[n+1];
        LinkedList<Integer> linkedList = new LinkedList<>();

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
                linkedList.add(i);
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("Count = "+count);
        System.out.println("position:"+linkedList.get(k-1));
       // System.out.println("nth prime:"+prime[k]);
    }



    public static void main(String[] args) {
        sieveFunction(20,5);
    }
}
