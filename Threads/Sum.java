package Threads;

import java.util.Scanner;

class Sum extends Thread {
    static int n;
    static int arr[][];
    int sum = 0;

    Sum(int n, int[][] arr) {
        this.n = n;
        this.arr = arr;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + arr[i][j];
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for a nxn matrix");
        int n = sc.nextInt();
        int[][] matrix2D = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the value at position " + "(" + (i + 1) + ", " + (j + 1) + ") : ");
                matrix2D[i][j] = sc.nextInt();
            }
        }
        Sum s = new Sum(n, matrix2D);
        s.start();
        try {
            s.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("sum of matrix elements is " + s.sum);
    }
}