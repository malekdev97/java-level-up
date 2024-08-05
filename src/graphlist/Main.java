package graphlist;


public class Main {
    
    public static void main(String[] args) {
        // Graph Matrix = Array 2D 
        // Graph List = List 2D 

        Graph graph = new Graph();

        graph.addVertex(new Vertex("Fahad")); // index 0
        graph.addVertex(new Vertex("Majed")); // index 1

        System.out.println(graph.vertices.get(0).get(0).data);

        graph.addEdge(0, 1);
        graph.addEdge(1, 0);
        graph.addEdge(0,0);
        
        graph.print();

    }
    
}
