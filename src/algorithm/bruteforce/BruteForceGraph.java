package bruteforce;


import java.util.ArrayList;
import java.util.List;

public class BruteForceGraph {

    static class Edge {
        int source;
        int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    static class Graph {
        int vertices;
        List<Edge> edges;

        public Graph(int vertices) {
            this.vertices = vertices;
            edges = new ArrayList<>();
        }

        public void addEdge(int source, int destination) {
            Edge edge = new Edge(source, destination);
            edges.add(edge);
        }
    }

    public static void bruteForcePaths(Graph graph, int startVertex) {
        boolean[] visited = new boolean[graph.vertices];
        int[] path = new int[graph.vertices];

        generatePaths(graph, startVertex, visited, path, 0);
        
        /* write your code here */


    }


   public static void generatePaths(Graph graph, int vertices, boolean[] visited, int[] path, int pathIndex) {

        /* write your code here */

        visited[vertices] = true;
        path[pathIndex] = vertices;
        pathIndex++;

        

        if (pathIndex == graph.vertices) {
            printPath(path);
        } else {
            for (Edge edge : graph.edges) {
                if ((edge.source == vertices &&!visited[edge.destination]) ||
                        (edge.destination == vertices &&!visited[edge.source])) {
                    generatePaths(graph, edge.destination, visited, path, pathIndex);
                }
            }
        }

       
        visited[vertices] = false;
}

    public static void printPath(int[] path) {
        for (int vertex : path) {
            System.out.print(vertex + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numVertices = 4;
        Graph graph = new Graph(numVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        int startVertex = 0;
        bruteForcePaths(graph, startVertex);
    }
}

