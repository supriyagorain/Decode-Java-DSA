import java.util.Scanner;
public class question1 {//store roll no. and marks of n students in a 2d array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr= new int[4][2];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j = 0; j < 2; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<n;i++){
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
