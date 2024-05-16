
import java.util.*;

class Graph {
    private int Vertices;
    private LinkedList<Integer>[] adjList; 
    public Graph(int vertices) {
      Vertices = vertices;
       adjList = new LinkedList[v];
        for (int i = 0; i < vertices; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int vertices, int w) {
        adjList[vertices].add(w);
    }
    public void DFS(int v) {
      boolean[] visited = new boolean[Vertices];
        DFSUtil(vertices, visited);
    }
    private void DFSUtil(int vertices, boolean[] visited) {
       visited[vertices] = true;
       System.out.print(vertices + " ");
        for (int neighbor : adjList[vertices]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }
    public void readGraph(Scanner sc) {
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
        System.out.println("Enter the number of vertices:");
        int Vertices = sc.nextInt();
        Graph graph = new Graph(Vertices);
        System.out.println("DFS starts from vertex 0:");
        graph.DFS(0);

    
    }
}
