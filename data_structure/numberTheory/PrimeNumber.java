package data_structure.numberTheory;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = checkPrime(number);
         if (isPrime == true){
             System.out.println("Prime");
         }else System.out.println("Not Prime");
    }

    private static boolean checkPrime(int number) {
         boolean n = true;
        for (int i = 2; i < number;i++){
            if (number%i == 0){
                n = false;

            }
        }
       return n;
    }
}
