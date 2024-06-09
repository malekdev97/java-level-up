package simplegraph;

import java.util.ArrayList;
    import java.util.LinkedList;

    public class GraphList {

        public ArrayList<LinkedList<Vertex>> vertices;

        public GraphList() {
            vertices = new ArrayList<>();
        }

        public void addVertex(Vertex v) {
            LinkedList<Vertex> list = new LinkedList<>();
            list.add(v);
            vertices.add(list);
        }

        public void addEdge(int src, int dst) {
            LinkedList<Vertex> list = vertices.get(src); // get the list of vertices at index src
            Vertex dstVertex = vertices.get(dst).get(0); // get the vertex at index dst
            list.add(dstVertex); // add the vertex to the list
        }

        public void print() {
            for (LinkedList<Vertex> list : vertices) {
                for (Vertex node : list) {
                    System.out.print(node.data + " -> ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {

            GraphList graph = new GraphList();

            graph.addVertex(new Vertex('A'));
            graph.addVertex(new Vertex('B'));
            graph.addVertex(new Vertex('C'));
            graph.addEdge(0, 1);
            graph.addEdge(1, 2);
            graph.addEdge(2, 0);

            graph.print();
        }
    }