
import java.util.*;

public class q8 {
    private int Vertices; 
    private LinkedList<Integer>[] adjList;
    private int[][] adjMatrix; 

    public q8(int vertices) {
        Vertices = vertices;
        adjList = new LinkedList[vertices];
        adjMatrix = new int[vertices][vertices];
        for (int i = 0; i < vertices; ++i) {
            adjList[i] = new LinkedList<>();
            Arrays.fill(adjMatrix[i], 0);
        }
    }

    
    public void addEdge(int vertices, int w) {
        adjList[vertices].add(w);
        adjMatrix[vertices][w] = 1;
    }

    
    public void displayAdjMatrix() {
     System.out.println("Adjacency Matrix:");
        for (int i = 0; i < Vertices; ++i) {
            for (int j = 0; j < Vertices; ++j) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void displayAdjList() {
      System.out.println("Adjacency List:");
        for (int i = 0; i < Vertices; ++i) {
            System.out.print(i + " -> ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5;
        q8 graph = new q8(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.displayAdjMatrix();  
        graph.displayAdjList();
    }
}
