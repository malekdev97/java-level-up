package simplegraph;

import java.util.ArrayList;

public class GraphMatrix {
      int[][] adjacencyMatrix; // adjacency matrix to store the graph relation 
    public ArrayList<Vertex> vertices; // list of vertices in the graph

    public GraphMatrix(int numVertices) {
        // set the size of the adjacency matrix
        adjacencyMatrix = new int[numVertices][numVertices];
    }

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

        // adding vertices 
        graph.addVertex(new Vertex('A'));
        graph.addVertex(new Vertex('B'));
        graph.addVertex(new Vertex('C'));

        // adding edges = linking vertices
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        
        // print the adjacency matrix
        for (int i = 0; i < 3; i++) {
            System.out.print(graph.vertices.get(i).data );
            for (int j = 0; j < 3; j++) {
                System.out.print(graph.adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}