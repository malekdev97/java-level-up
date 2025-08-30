package graphmatrix;

import simplegraph.GraphList;

public class Main {
    
    public static void main(String[] args) {
        // example one: adding vertices to the graph
        Graph graph = new Graph();

        

        graph.addVertex(new Vertex('A')); // index 0
        graph.addVertex(new Vertex('B')); // index 1

        System.out.println(graph.vertices.get(0).data);

        graph.addEdge(0, 1);
        graph.addEdge(1, 0);
        graph.addEdge(0,0);
    }
    
}
