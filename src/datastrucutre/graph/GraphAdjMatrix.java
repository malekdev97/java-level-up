package graph;

import java.util.LinkedList;
import java.util.Queue;
 
class GraphMatrix {
    private int numVertices;
    private int[][] adjacencyMatrix;

    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int v1, int v2, int weight) {
        adjacencyMatrix[v1][v2] = weight;
        adjacencyMatrix[v2][v1] = weight;
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int i = 0; i < numVertices; i++) {
                if (adjacencyMatrix[currentVertex][i] != 0 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int currentVertex, boolean[] visited) {
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");

        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[currentVertex][i] != 0 && !visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(6);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 10);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 1);
        graph.addEdge(3, 5, 6);
        graph.addEdge(4, 5, 8);

        System.out.println("Breadth First Traversal:");
        graph.BFS(0);
        System.out.println();
        graph.DFS(0);

    }
}