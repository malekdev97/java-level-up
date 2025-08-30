package bfsgraph;

import java.util.LinkedList;
import java.util.Queue;


class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;

    public Graph(int vertices)
    {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adjList[i] = new LinkedList<>();
    }

    /* function to add an edge to the graph */
    void addEdge(int u, int v) { 
        adjList[u].add(v); 
    
    }

    public void breadthfirstSearch(int startNode){

        /* Create a queue for BFS */
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];

        /* mark the current node as visited and enqueue it */
        visited[startNode] = true;
        queue.add(startNode);

        /* iterate over the queue */
        while (!queue.isEmpty()) {
            /* Dequeue a vertex from queue and print it */
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            /* vertex currentNode If an adjacent has not been visited, then mark it visited and enqueue it */
            for (int neighbor : adjList[currentNode]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
    public class Main {
    public static void main(String[] args)
    {
        int vertices = 5;

        /* Create a graph */

        Graph graph = new Graph(vertices);

        /* Add edges to the graph */
        graph.addEdge(0, 1); // adds an edge between vertices 0 and 1.
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        System.out.print( "Breadth First Traversal starting from vertex 0: ");
        graph.breadthfirstSearch(0); // starting from vertex 0 
    }
}
}