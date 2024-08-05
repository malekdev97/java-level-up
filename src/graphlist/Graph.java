package graphlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Vertex>> vertices = new ArrayList<>();

    public void addVertex(Vertex v) {
        LinkedList<Vertex> list1 = new LinkedList<>();
        list1.add(v);
        vertices.add(list1);
    }

    public void addEdge(int src, int dest) {
        LinkedList<Vertex> list1 = vertices.get(src);
        Vertex destt = vertices.get(dest).get(0);
        list1.add(destt);

    }

    public void printt() {
        for (LinkedList<Vertex> list1 : vertices) {
            for (Vertex v : list1) {
                System.out.print(v.data);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();

        g.addVertex(new Vertex("A"));
        g.addVertex(new Vertex("B"));

        g.addEdge(0, 1);
        g.addEdge(1, 0);
        g.printt();

        int test[] = { 1, 2, 3, 4 };
        for (int i : test) {
            System.out.println(i);
        }
    }
}
