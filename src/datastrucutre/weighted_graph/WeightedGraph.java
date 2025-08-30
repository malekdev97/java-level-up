package weighted_graph;
import java.util.*;

class Edge<T> { 
	T neighbor; //connected vertex
	int weight; //weight
	
	//Constructor, Time O(1) Space O(1)
	public Edge(T v, int w) {
		this.neighbor = v; 
		this.weight = w;
	}
	
	//Time O(1) Space O(1)
	@Override
	public String toString() {
		return "(" + neighbor + "," + weight + ")";
	}
}
 
public class WeightedGraph<T> {
	Map<T, LinkedList<Edge<T>>> adj = new HashMap<>();
	boolean directed;
	
	//Constructor, Time O(1) Space O(1)
	public WeightedGraph () {
		directed = false; //default, Undirected graph
	}
	
	//Constructor, Time O(1) Space O(1)
	public WeightedGraph(boolean d) {
		directed = d;
	}
}