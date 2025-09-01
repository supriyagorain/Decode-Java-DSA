public class forEach {
    public static void main(String[] args) {
        int[] a={3,5,6,4};
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();

        //1 2 3
        //4 5 6
        int[][]b= {{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        for(int[] ele:b){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
