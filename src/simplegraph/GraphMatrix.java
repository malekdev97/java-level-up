package simplegraph;

import java.util.ArrayList;

public class GraphMatrix {
      int[][] adjacencyMatrix; // adjacency matrix to store the graph relation 
      // create arraylist of vertices 
    public ArrayList<Vertex> vertices = new ArrayList<Vertex>(); // list of vertices in the graph

    public GraphMatrix(int size) {
        // initialize the ArrayList
        
        // set the size of the adjacency matrix
        adjacencyMatrix = new int[size][size];
    }

    // 3 add vertex 
    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    // link source vertex to dest vertex
    public void addEdge(int src, int dst) {
            adjacencyMatrix[src][dst] = 1;
            // adjacencyMatrix[dst][src] = 1; // For undirected graph
    }
    

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(3);

        Vertex v1 = new Vertex('A');
        Vertex v2 = new Vertex('B');
        Vertex v3 = new Vertex('C');
        // adding vertices 
        graph.addVertex(v1); // 0
        graph.addVertex(v2); // 1
        graph.addVertex(v3); // 2

        // adding edges = linking vertices
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        
        // print the adjacency matrix

        // print source 
        for(int v = 0; v < 3; v++){
            System.out.print(" "+graph.vertices.get(v).data);
        }

        System.err.println();
        for (int i = 0; i < 3; i++) {
            // destntion 
            System.out.print(graph.vertices.get(i).data );
            for (int j = 0; j < 3; j++) {
                System.out.print(graph.adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}