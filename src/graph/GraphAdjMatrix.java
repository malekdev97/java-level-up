package graph;

import java.util.ArrayList;

public class GraphAdjMatrix {

    // to store the vertices of the graph
    public ArrayList<Vertex> vertices;

    // to store vertices relations using adjacency matrix
    public int[][] adjMatrix; // 2D array

    public GraphAdjMatrix() {
        vertices = new ArrayList<>();

        adjMatrix = new int[3][3];
    }

    public void addVertex(char data) {
        vertices.add(new Vertex(data));
    }

    public void addEdge(int src, int dest)
    {
        adjMatrix[src][dest] = 1; 
        // adjMatrix[dest][src] = 1; // undirected graph
    }
    
    public void display() {

        System.out.print("\t");
        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i).data + " "); // print vertices destination
        }
        System.out.println();

        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i).data + "\t"); // print vertices source
            for (int j = 0; j < vertices.size(); j++) {
                System.out.print(adjMatrix[i][j] + " "); // print two-dimensional array
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        GraphAdjMatrix graph = new GraphAdjMatrix();
        
        graph.addVertex('A'); // 0
        graph.addVertex('B'); // 1
        graph.addVertex('C'); // 2

        
        graph.addEdge(0, 1); // A -> B
        graph.addEdge(1, 2); // B -> C
        graph.addEdge(2, 0); // C -> A

        
        graph.display();
    }
}
