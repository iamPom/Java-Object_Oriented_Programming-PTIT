package TimKiem;


import java.io.*;
import java.util.*;
 
//int a[100][100], n, u, vs[100], e[100], s[100];
//    void DfsNx(int u){int top= 1; s[top]= u; vs[u] = 1;
//    while (top > 0){ int v = s[top]; int ok = 1;
//    for (int i= 1; i<=n; i++)
//        if (vs[i]==0 && a[v][i]==1) { top++; s[top] = i;
//            vs[i] = 1; e[i]= v; ok = 0; break;
//            }
//        if (ok==1) top--;
//    }
//}
class DoThi {
    private int V; 
 
    private LinkedList<Integer> adj[];
 
    // Constructor
    @SuppressWarnings("Khong duoc ktra") DoThi(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
 
    void addEdge(int v, int w)
    {
        adj[v].add(w); 
    }
 
    void DFSUtil(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
 
    void DFS()
    {
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
    }
 
    public static void main(String args[])
    {
        DoThi g = new DoThi(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Tim Kiem theo chieu sau");
        g.DFS();
    }
}