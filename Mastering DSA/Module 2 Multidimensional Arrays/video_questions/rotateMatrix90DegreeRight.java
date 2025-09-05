public class rotateMatrix90DegreeRight {
    public static void main(String[] args) {
         int[][] arr={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
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
            }
            for (int i = 0; i < m; i++) {
                int a=0;int b=n-1;
                while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;b--;
                }
            }
            System.out.println();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
}
