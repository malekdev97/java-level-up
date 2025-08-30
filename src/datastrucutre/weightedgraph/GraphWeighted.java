package weightedgraph;

import java.util.ArrayList;

public class GraphWeighted {

    class Vertex {
        char data;

        public Vertex(char data) {
            this.data = data;
        }
    }

    private ArrayList<Vertex> vertices = new ArrayList<>();
    private int[][] adjacencyMatrix;

    public GraphWeighted(int numVertices) {
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addVertex(char data) {
        vertices.add(new Vertex(data));
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
    }

    public void display() {
        System.out.print("\t");
        for (Vertex vertex : vertices) {
            System.out.print(vertex.data + "\t");
        }
        System.out.println();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            System.out.print(this.vertices.get(i).data + "\t");
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphWeighted graph = new GraphWeighted(3);
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');

        graph.addEdge(0, 1, 2);
        graph.addEdge(1, 2, 6);
        graph.addEdge(2, 0, 8);

        graph.display();
    }
}