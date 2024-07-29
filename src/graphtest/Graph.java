package graphtest;

import java.util.ArrayList;

public class Graph {
    
    ArrayList<Vertex> vertices; // defined, 

    int [][] matrix;

    // constructor , __init__
    public Graph() {
        // initlize vertices 
        vertices = new ArrayList<>();

        matrix = new int[2][2];
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

}
