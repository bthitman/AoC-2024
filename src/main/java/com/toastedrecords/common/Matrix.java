package com.toastedrecords.common;

import java.util.List;

public class Matrix {
    private int[][] matrix;

    public Matrix(List<Integer>... rows) {
        for (int i = 0; i < rows.length; i++) {
            var rowData = rows[i];
            matrix = new int[rows.length][rowData.size()];
            for (int j = 0; j < rowData.size(); j++) {
                matrix[i][j] = rowData.get(j);

            }
        }
    }
}
