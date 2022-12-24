package data_structure.linkedlist;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Doubly_ll {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void creation(){
        int data,n,m,p;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.print("Enter data:");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null){
                head = new_node;
                tail = new_node;
            }else {

                System.out.print("Insert at the begining, press 1:");
                System.out.print("Insert at the end, press 2:");
                System.out.print("Insert at specific location, press 3:");
                System.out.println("");
                m =sc.nextInt();
                switch (m){
                    case 1:
                        new_node.next = head;
                        head.prev = new_node;
                        head = new_node;
                        break;
                    case 2:
                     tail.next = new_node;
                     new_node.prev = tail;
                     tail = new_node;
                         break;
                    case 3:
                        System.out.println("Enter position of the node:");
                        p = sc.nextInt();
                        Node temp1 = head;
                        Node ptr = temp1.next;

                        for (int i = 1;i<p-1;i++){
                            temp1 = ptr;
                           ptr = ptr.next;
                        }
                        new_node.prev = temp1;
                        new_node.next = ptr;
                        temp1.next = new_node;
                        ptr.prev = new_node;
                        break;
                }

            }
            System.out.println("Do you want to add more data.If yes,press 1");
            n = sc.nextInt();

        } while (n == 1);



    }
    public void traverser(){
        Node temp = head;
        if (head==null){
            System.out.println("LL does not exist");
        }
        else {
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Doubly_ll ll = new Doubly_ll();
        ll.creation();
        ll.traverser();
    }
}
