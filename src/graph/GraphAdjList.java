package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphAdjList {

    // store the vertices
    public ArrayList<LinkedList<Vertex>> vertices; // array list of linked list

    public GraphAdjList() 
    {
        vertices = new ArrayList<>();
    }
    

    public void addVertex(Vertex newVertex) 
    {
        LinkedList<Vertex> newList = new LinkedList<>();
        newList.add(newVertex);
        vertices.add(newList);
    }

    public void addEdge(int src, int dst)
    {
        LinkedList srcList = vertices.get(src);
        Vertex dstVertex = vertices.get(dst).get(0);

        srcList.add(dstVertex);
    }

    public void display()
    {
        for(LinkedList<Vertex> list : vertices)
        {
            for(Vertex vertex : list)
            {
                System.out.print(vertex.data + " -> ");
            }

            System.out.println();
        }
    }


        public static void main(String[] args) {

            GraphAdjList graph = new GraphAdjList();

            graph.addVertex(new Vertex('A'));
            graph.addVertex(new Vertex('B'));
            graph.addVertex(new Vertex('C'));
            graph.addEdge(0, 1);
            graph.addEdge(1, 2);
            graph.addEdge(2, 0);

            graph.display();
        }

}
