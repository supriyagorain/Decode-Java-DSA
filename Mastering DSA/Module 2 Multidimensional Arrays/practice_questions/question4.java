import java.util.Scanner;

public class question4 {//transpose of matrix
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr= new int[m][n];
        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
             //transpose
            int[][] transpose=new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
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
