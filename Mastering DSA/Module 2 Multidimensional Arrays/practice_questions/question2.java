import java.util.Scanner;

public class question2 {//max element in a 2d array
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
        int mx= Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx=Math.max(mx, arr[i][j]);          
            }
        }
         System.out.println(mx);
    }
}
