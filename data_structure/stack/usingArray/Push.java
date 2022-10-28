package data_structure.stack.usingArray;

import java.util.Scanner;

public class Push {
    Main obj = new Main();
    int value;
   void PushElement(){
       if (obj.top == obj.array.length -1){
           System.out.println("Overflow");
       }else {
           System.out.println("Enter data:");
           Scanner sn  = new Scanner(System.in);
           value = sn.nextInt();
           obj.top++;
           obj.array[obj.top] = value;
       }


    }
}
