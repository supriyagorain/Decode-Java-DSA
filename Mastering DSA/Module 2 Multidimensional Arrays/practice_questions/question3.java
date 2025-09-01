import java.util.Scanner;

public class question3 {//add 2 martrices
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] a= new int[m][n];
        int[][] b= new int[m][n];
        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                a[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        sc.close();
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
        }
    }
}
