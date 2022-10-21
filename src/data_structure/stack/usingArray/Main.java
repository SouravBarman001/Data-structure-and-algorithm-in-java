package data_structure.stack.usingArray;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    int [] array = new int[10];
    int top = -1;
    public static void main(String[] args) {


        while(true) {
            int choice;

            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            Scanner sn = new Scanner(System.in);
            choice = sn.nextInt();

            switch (choice) {
                case 1:
                    Push obj = new Push();
                    obj.PushElement();
                    break;
                case 2:
                    Pop obj1 = new Pop();
                    obj1.PopElement();
                    break;
                case 3:
                    Display obj2 = new Display();
                    obj2.displayAll();
                    break;
                case 4:
                    exit(0);


            }
        }

}}
