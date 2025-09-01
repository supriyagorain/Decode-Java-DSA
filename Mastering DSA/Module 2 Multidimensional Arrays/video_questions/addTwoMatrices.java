public class addTwoMatrices {
    public static void main(String[] args) {
        int[][] a={{1,4,2},{3,6,8},{9,4,6}};
        int[][] b={{1,4,2},{3,6,8},{9,4,6}};
        int m=a.length;
        int n=a[0].length;
        int[][] res=new int[m][n];

        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
