public class transposeMatrix {//leetcode 867 easy
         public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
            int n=matrix[0].length;
            int[][] transposem=new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                   transposem[j][i]=matrix[i][j];
                }
               
            }
             return transposem;
    }

}
