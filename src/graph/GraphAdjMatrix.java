package graph;

public class GraphAdjMatrix {

    private int[][] adjMatrix;
    private int numVertices;

    public GraphAdjMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }

    public boolean isEdge(int i, int j) {
        return adjMatrix[i][j] == 1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for(int j : adjMatrix[i]) {
                s.append(j + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        GraphAdjMatrix g = new GraphAdjMatrix(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        System.out.print(g.toString());
    }
}
