import java.util.Scanner;

public class outputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[][] arr=new int[3][3];
        int m=arr.length;//no. of rows
        int n=arr[0].length;//no. of columns
        //input
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(m+" "+n);
        //output
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
