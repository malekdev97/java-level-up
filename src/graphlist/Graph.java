package graphlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    
    ArrayList<LinkedList<Vertex>> vertices = new ArrayList<>();

    public void addVertex(Vertex vertex) {
        LinkedList<Vertex> list = new LinkedList<>();

        list.add(vertex);
        
        vertices.add(list);
    }


    public void addEdge(int src, int dest) {
        LinkedList<Vertex> list = vertices.get(src);

        Vertex vertexDest = vertices.get(dest).get(0);

        list.add(vertexDest);

    }

    public void print() {
        
        for(LinkedList<Vertex> list : vertices) {
            for(Vertex v : list) {
                System.out.print(v.data + " -> ");
            }
            System.out.println();
        }
    }
}
