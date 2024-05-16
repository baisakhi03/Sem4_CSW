package assignment8;
import java.util.*;

class Graph1 {
    private int Vertices;
    private LinkedList<Integer>[] adjList; 

    public Graph1(int vertices) {
        Vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int vertices, int w) {
        adjList[vertices].add(w);
    }
    public void BFS(int start) {
        boolean[] visited = new boolean[Vertices];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int vertices = queue.poll();
            System.out.print(vertices + " ");
            for (int neighbor : adjList[vertices]) {
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
        int Vertices = sc.nextInt();
        Graph1 graph = new Graph1(Vertices);
        graph.readGraph(sc); 
        System.out.println("Breadth-First Search (BFS) starting from vertex 0:");
        graph.BFS(0);

      
    }
}
