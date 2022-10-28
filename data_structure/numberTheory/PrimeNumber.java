package data_structure.numberTheory;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter test case:");
        int Tcase = sc.nextInt();
       for (int i = 0;i < Tcase;i++ )
        {

            int number = sc.nextInt();
            boolean isPrime = checkPrime(number);
            if (isPrime == true) {
                System.out.println("Prime");
            } else
            {
                System.out.println("Not Prime");
            }

        }
    }

    private static boolean checkPrime(int number) {
         boolean n = true;
         if (number < 2){n=true;}
         if (number <= 3){n=true;}
         if (number%2 == 0){n = false;}
         int num = (int) Math.sqrt(number);
     //   System.out.println(num);
        for (int i = 3; i <= num;i++){
            if (number%i == 0){
                n = false;

            }
        }
       return n;
    }
}
