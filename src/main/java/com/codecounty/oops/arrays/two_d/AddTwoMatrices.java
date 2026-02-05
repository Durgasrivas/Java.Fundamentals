package com.codecounty.oops.arrays.two_d;

import java.util.Arrays;

public class AddTwoMatrices {
    public static void main(String[] args){
        int [][] MatA={
                {2,4,7},
                {32,6,0}
        };
        int [][] MatB={
                {23,90,7},
                {23,234,-23}
        };
        addTwoMatrices(MatA,MatB);
    }

    private static void addTwoMatrices(int[][] MatA, int[][] MatB) {
        int rowsA = MatA[0].length;
        int rowsB = MatB[0].length;

        int columnsMatA = MatA[0].length;
        int columnsMatB = MatB[0].length;

        //check if the dimensions are matching

        if((rowsA == rowsB) && (columnsMatA == columnsMatB)) {
            int[][] result = new int[rowsA][columnsMatA];
            for(int i = 0;i<MatA.length;i++){
                for(int j=0;j<MatB.length;j++){
                    result[i][j]=MatA[i][j]+MatB[i][j];
                }
            }
            for(int i = 0;i<result.length;i++){
                System.out.println(Arrays.toString(result[i]));
            }
        }
     }
}

//MatrixMultiplication H/W