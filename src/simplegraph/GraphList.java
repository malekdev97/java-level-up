package simplegraph;

import java.util.ArrayList;
    import java.util.LinkedList;

    public class GraphList {

        // ArrayList of LinkedList to store the graph relation
        public ArrayList<LinkedList<Vertex>> vertices = new ArrayList<LinkedList<Vertex>>();

    // create addVertex to add a list into the array 
        public void addVertex(Vertex v) {
            
            LinkedList<Vertex> list = new LinkedList<Vertex>();
            list.add(v);
            vertices.add(list);
        }
 
        /// addEdge to link the source vertex to the destination vertex
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

        public void DFS(int startVertex) {
            boolean[] visited = new boolean[vertices.size()];
            DFSUtil(startVertex, visited);
        }

        private void DFSUtil(int currentVertex, boolean[] visited) {
            visited[currentVertex] = true;
            System.out.print(vertices.get(currentVertex).get(0).data + " ");

            for (Vertex v : vertices.get(currentVertex)) {
                if (!visited[v.data - 'A']) {
                    DFSUtil(v.data - 'A', visited);
                }
            }
        }
        // use stack to implement DFS
        public void StackDFS() {
            boolean[] visited = new boolean[vertices.size()];
            LinkedList<Integer> stack = new LinkedList<Integer>();
            stack.push(0);
            visited[0] = true;
            while (!stack.isEmpty()) {
                int currentVertex = stack.pop();
                System.out.print(vertices.get(currentVertex).get(0).data + " ");
                for (Vertex v : vertices.get(currentVertex)) {
                    if (!visited[v.data - 'A']) {
                        stack.push(v.data - 'A');
                        visited[v.data - 'A'] = true;
                    }
                }
            }
        }


        public static void main(String[] args) {

            GraphList graph = new GraphList();

            graph.addVertex(new Vertex('A'));
            graph.addVertex(new Vertex('B'));
            graph.addVertex(new Vertex('C'));
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 2);
            graph.addEdge(2, 0);

            graph.StackDFS();
        }
    }