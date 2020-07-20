import java.util.*;

class Edge
{
	int src, dest, weight;

	public Edge(int src, int dest, int weight) {
		this.src = src;
		this.dest = dest;
		this.weight = weight;
	}

	public String toString() {
		return "(" + src + ", " + dest + ", " + weight + ")";
	}
}
class DisjointSet
{
	Map<Integer, Integer> parent = new HashMap<>();
	public void makeSet(int N)
	{
		for (int i = 0; i < N; i++)
			parent.put(i, i);
	}
	private int Find(int k)
	{
		if (parent.get(k) == k)
			return k;
		return Find(parent.get(k));
	}
	private void Union(int a, int b)
	{
		int x = Find(a);
		int y = Find(b);

		parent.put(x, y);
	}
	public static List<Edge> KruskalAlgo(List<Edge> edges, int N)
	{
		List<Edge> MST = new ArrayList();
		DisjointSet ds = new DisjointSet();
		ds.makeSet(N);

		int index = 0;
		while (MST.size() != N - 1)
		{
			Edge next_edge = edges.get(index++);
			int x = ds.Find(next_edge.src);
			int y = ds.Find(next_edge.dest);
			if (x != y)
			{
				MST.add(next_edge);
				ds.Union(x, y);
			}
		}
		return MST;
	}
}

class Main
{
	public static void main(String[] args)
	{
		List<Edge> edges = Arrays.asList(
				new Edge(0, 1, 7), new Edge(1, 2, 8),
				new Edge(0, 3, 5), new Edge(1, 3, 9),
				new Edge(1, 4, 7), new Edge(2, 4, 5),
				new Edge(3, 4, 15), new Edge(3, 5, 6),
				new Edge(4, 5, 8), new Edge(4, 6, 9),
				new Edge(5, 6, 11)
		);
		Collections.sort(edges, Comparator.comparingInt(e -> e.weight));

		final int N = 7;

		List<Edge> e = DisjointSet.KruskalAlgo(edges, N);

		for (Edge edge: e) {
			System.out.println(edge);
		}
	}
}