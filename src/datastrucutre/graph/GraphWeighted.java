package graph;


public class GraphWeighted {

    private int[][] adjacencyMatrix;

    public GraphWeighted(int numVertices) {
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
        adjacencyMatrix[destination][source] = weight;
    }

    public static void main(String[] args) {

        GraphWeighted graph = new GraphWeighted(4);

                    // source , destination, weight
        graph.addEdge(0, 1, 5);
        graph.addEdge(1, 2, 13);
        graph.addEdge(2, 3, 9);
        graph.addEdge(3, 1, 7);
        
        // Print the adjacency matrix
        for (int source = 0; source < 4; source++) {
            for (int dest = 0; dest < 4; dest++) {
                System.out.print(graph.adjacencyMatrix[source][dest] + "\t");
            }
            System.out.println();
        }
    }
}
