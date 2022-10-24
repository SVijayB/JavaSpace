import java.util.*;

public class m_colouring_decision {
    public static boolean isValid(int[][] graph, int[] colors) {
        int n = graph.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (graph[i][j] == 1 && colors[i] == colors[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean graphColoringOne(int[][] graph, int m, int[] colors, int i) {
        if (i == graph.length) {
            return isValid(graph, colors);
        }
        for (int c = 1; c <= m; c++) {
            colors[i] = c;
            if (graphColoringOne(graph, m, colors, i + 1)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int e = sc.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < e; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        int[] colors = new int[n];
        if (graphColoringOne(graph, m, colors, 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
