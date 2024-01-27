package graph;// Adjascency List representation in Java

import java.util.*;

class GraphAdjList {

    static ArrayList<LinkedList<Vertex>> adjList;

    public GraphAdjList() {
        adjList = new ArrayList<>();
    }

    public void addVertex(int data) {
        Vertex vertex = new Vertex(data);
        LinkedList<Vertex> list = new LinkedList<>();
        list.add(vertex);
        adjList.add(list);
    }

    public void addEdge(int src, int dest) {
        Vertex vertex = new Vertex(dest);
        LinkedList<Vertex> list = adjList.get(src);
        list.add(vertex);
    }

    public void removeEdge(int src, int dest) {
        LinkedList<Vertex> list = adjList.get(src);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).data == dest) {
                list.remove(i);
            }
        }
    }

    public boolean isEdge(int src, int dest) {
        LinkedList<Vertex> list = adjList.get(src);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).data == dest) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < adjList.size(); i++) {
            s.append(i + ": ");
            for(int j = 0; j < adjList.get(i).size(); j++) {
                s.append(adjList.get(i).get(j).data + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        GraphAdjList g = new GraphAdjList();
        g.addVertex(0);
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        System.out.print(g.toString());
    }

}