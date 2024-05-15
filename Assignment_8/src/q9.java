
import java.util.*;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    public Graph(int v) {
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

    // Depth-first search (DFS)
    public void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
    }

    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // Read graph and store it in adjacency list representation
    public void readGraph(Scanner scanner) {
        System.out.println("Enter the number of vertices:");
        int vertices = sc.nextInt();
        System.out.println("Enter the number of edges:");
        int edges = sc.nextInt();

    
        for (int i = 0; i < edges; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            addEdge(from, to);
        }
    }
}

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a graph
        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();
        Graph graph = new Graph(V);
        System.out.println("DFS starts from vertex 0:");
        graph.DFS(0);

    
    }
}
