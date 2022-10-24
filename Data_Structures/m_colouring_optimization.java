import java.util.*;

public class m_colouring_optimization {
    public static void graphColoringThree(int[][] graph, int n) {
        int[] colors = new int[n];
        Arrays.fill(colors, -1);
        colors[0] = 1;

        int[] alreadyAssigned = new int[n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(alreadyAssigned, -1);
            for (int j = i + 1; j < n; j++) {
                if (graph[i][j] == 1) {
                    if (colors[j] != -1) {
                        alreadyAssigned[colors[j]] = 1;
                    }
                }
            }  
            int c;
            for (c = 1; c <= n; c++) {
                if (alreadyAssigned[c] == 0) {
                    break;
                }
            }
            colors[i] = c;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(colors[i] + " ");
        }
        System.out.println();
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, colors[i]);
        }
        System.out.println("Number of colors used: " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < e; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        
        graphColoringThree(graph, n);
        sc.close();
    }
}
