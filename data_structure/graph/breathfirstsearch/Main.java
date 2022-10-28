package data_structure.graph.breathfirstsearch;
// sourav barman
// Here we use adjacency list to represent the graph


import java.util.LinkedList;
import java.util.Scanner;

class graphImp{
    private LinkedList<Integer> adjacency[];
    graphImp(int v){
        adjacency = new LinkedList[v];
       for (int i = 0; i < v ; i++){
        adjacency[i] = new LinkedList<Integer>();
        }

    }
    public void insertEdge(int s,int d){
   adjacency[s].add(d);
   adjacency[d].add(s);
        System.out.println(adjacency[d]);
        System.out.println(adjacency[s]);
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices and edges:");
        int v = sc.nextInt();
        int e = sc.nextInt();
        graphImp g = new graphImp(v);
        System.out.println("Enter the connection:");
        for(int i = 0 ; i < e; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insertEdge(s,d);
        }

    }
}
