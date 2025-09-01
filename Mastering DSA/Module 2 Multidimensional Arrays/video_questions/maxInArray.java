public class maxInArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{46,41,5},{56,89,21}};
        int mx= Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mx=Math.max(mx, arr[i][j]);  
                sum+=arr[i][j];           
            }
        }
         System.out.println("Max is:"+mx);
         System.out.println("Sum is:"+sum);
    }
}
