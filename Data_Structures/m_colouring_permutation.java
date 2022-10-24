/*
M == Number of different colours;
N ==  Number of vertices;
E == Number of edges

Time Complexity: O( M ^ N );
*/

import java.util.*;

public class m_colouring_permutation {
    public static boolean isValid(int[][] graph, int[] colors, int c) {
        int n = graph.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (graph[i][j] == 1) {
                    if (colors[i] == c && colors[j] == c) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void graphColoringTwo(int[][] graph, int m, int[] colors, int i) {
        if (i == graph.length) {
            System.out.println(Arrays.toString(colors));
            return;
        }
        for (int c = 1; c <= m; c++) {
            if (isValid(graph, colors, c)) {
                colors[i] = c;
                graphColoringTwo(graph, m, colors, i + 1);
                colors[i] = 0;
            }
        }
        return;
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
        graphColoringTwo(graph, m, colors, 0);
        sc.close();
    }
}
