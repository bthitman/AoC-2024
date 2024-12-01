package com.toastedrecords.common;

public class MatrixPlay {
    public static void main(String[] args) {
        var m1 = initM1();
        var m2 = intiM2();
        printMatrix(m1);
        System.out.println();
        printMatrix(m2);
        System.out.println();
        var result = multiply(m1, m2);
        printMatrix(result);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] multiply(int[][] m1, int[][] m2) {
        var result = new int[m1.length][m2[0].length];
        result[0][0] = (m1[0][0]*m2[0][0]) + (m1[0][1]*m2[1][0]) + (m1[0][2]*m2[2][0]);
        result[0][1] = (m1[0][0]*m2[0][1]) + (m1[0][1]*m2[1][1]) + (m1[0][2]*m2[2][1]);
        result[1][0] = (m1[1][0]*m2[0][0]) + (m1[1][1]*m2[1][0]) + (m1[1][2]*m2[2][0]);
        result[1][1] = (m1[1][0]*m2[0][1]) + (m1[1][1]*m2[1][1]) + (m1[1][2]*m2[2][1]);
        return result;
    }

    private static int[][] intiM2() {
        var m2 = new int[3][2];
        m2[0][0] = 4;
        m2[0][1] = -5;
        m2[1][0] = -3;
        m2[1][1] = 0;
        m2[2][0] = 1;
        m2[2][1] = 2;
        return m2;
    }

    private static int[][] initM1() {
        var m1 = new int[2][3];
        m1[0][0] = 2;
        m1[0][1] = 3;
        m1[0][2] = -1;
        m1[1][0] = 6;
        m1[1][1] = 1;
        m1[1][2] = -2;
        return m1;
    }
}
