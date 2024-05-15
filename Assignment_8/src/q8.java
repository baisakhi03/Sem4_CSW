
import java.util.*;

public class q8 {
    private int Vertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list
    private int[][] adjMatrix; // Adjacency matrix

    public q8(int vertices) {
        Vertices = vertices;
        adjList = new LinkedList[vertices];
        adjMatrix = new int[vertices][vertices];
        for (int i = 0; i < vertices; ++i) {
            adjList[i] = new LinkedList<>();
            Arrays.fill(adjMatrix[i], 0);
        }
    }

    // Add an edge to the graph
    public void addEdge(int vertices, int w) {
        adjList[vertices].add(w);
        adjMatrix[vertices][w] = 1;
    }

    // Display adjacency matrix
    public void displayAdjMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < Vertices; ++i) {
            for (int j = 0; j < Vertices; ++j) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Display adjacency list
    public void displayAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < Vertices; ++i) {
            System.out.print(i + " -> ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices

        // Create a graph
        q8 graph = new q8(V);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        // Display adjacency matrix
        graph.displayAdjMatrix();

        // Display adjacency list
        graph.displayAdjList();
    }
}
