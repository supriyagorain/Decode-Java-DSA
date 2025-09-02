public class rowWiseAndColWisePrinting {
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
            int[][] transpose=new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j]+" ");
                   transpose[j][i]=arr[i][j];
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(transpose[i][j]+" ");
                }
                System.out.println();
            }
        }
}
