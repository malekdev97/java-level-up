package graph;

import java.util.*;

public class GraphAdjList {
    private Map<Integer, List<Integer>> adjList;

    public GraphAdjList(int vertices) {
        adjList = new HashMap<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.put(i, new LinkedList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // For undirected graph
    }

    public Iterable<Integer> adj(int v) {
        return adjList.get(v);
    }
}