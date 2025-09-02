public class transformIntoTranspose {
    public static void main(String[] args) {
         int[][] arr={{1,4,2},{3,6,8},{9,4,6}};
            int m=arr.length;
            int n=arr[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
             //transpose
            for (int i = 0; i < m; i++) {
                for (int j = 0; j <=i; j++) {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
                System.out.println();
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
}
