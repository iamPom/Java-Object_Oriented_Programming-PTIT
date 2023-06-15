// code:
// name:
package TimKiem;

import java.io.*;
import java.util.*;

//int a[100][100], n, u, vs[100], e[100], q[100];
//void Bfs(int u){ int v, dq = 1, cq = 0;
//    cq++; q[cq] = u; vs[u] = 1;
//    while (dq <= cq){ v = q[dq]; dq++;
//        cout << v << ” ”;
//        for (int i= 1; i<=n; i++)
//            if (vs[i]==0 && a[v][i]==1) {
//                cq++; q[cq] = i; vs[i] = 1; e[i]= v; }
//        }
//    }
class Graph{
    private int V;  
    private LinkedList<Integer> adj[]; 
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
 
    void BFS(int s){

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
 
    public static void main(String args[])
    {
        Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Tim kiem theo chieu rong bat dau tai dinh 2");
 
        g.BFS(2);
    }
}
