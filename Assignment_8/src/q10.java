package assignment8;
import java.util.*;

class Graph1 {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adjList; 

    public Graph1(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // Breadth-first search (BFS)
    public void BFS(int start) {
        boolean[] visited = new boolean[V];
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int neighbor : adjList[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }


    public void readGraph(Scanner sc) {
        System.out.println("Enter the number of vertices:");
        int vertices = sc.nextInt();
        System.out.println("Enter the number of edges:");
        int edges = sc.nextInt();

        System.out.println("Enter " + edges + " edges (format: from to):");
        for (int i = 0; i < edges; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            addEdge(from, to);
        }
    }
}

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();
        Graph1 graph = new Graph1(V);

       
        graph.readGraph(sc);

        
        System.out.println("Breadth-First Search (BFS) starting from vertex 0:");
        graph.BFS(0);

      
    }
}
