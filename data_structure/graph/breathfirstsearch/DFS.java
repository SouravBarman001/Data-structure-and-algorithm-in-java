package data_structure.graph.breathfirstsearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
    private LinkedList<Integer> adjacency[];
    DFS(int v){
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


    public void dfs(int source){
        boolean visited_nodes[] = new boolean[adjacency.length];
        int parent_nodes[]=new int[adjacency.length];
        Stack<Integer> q = new Stack<>();
        q.add(source);
        visited_nodes[source]=true;
        parent_nodes[source]=-1;

        while (!q.isEmpty()){
            int p = q.pop();
            System.out.print(p);
            for (int i:adjacency[p]){
                if (visited_nodes[i]!=true){
                    visited_nodes[i] = true;
                    q.add(i);
                    parent_nodes[i] = p;
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices and edges:");
        int v = sc.nextInt();
        int e = sc.nextInt();
        DFS g = new DFS(v);
        System.out.println("Enter the connection:");
        for(int i = 0 ; i < e; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insertEdge(s,d);
        }

        System.out.println("Enter dfs source:");
        int source = sc.nextInt();
        g.dfs(source);
    }
}
