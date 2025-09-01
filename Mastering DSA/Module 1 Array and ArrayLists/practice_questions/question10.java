import java.util.Scanner;

public class question10 {
public static void main(String[] args) {//next greatest element including the element
         Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;
        for (int k = 0; k < size; k++) {
            arr[k] = sc.nextInt();
        }

        int[]ans=new int[n];
        int nge=arr[n-1];
        for(int i=n-1;i>=0;i--){
            nge=Math.max(nge,arr[i]);
            ans[i]=nge;
        }
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        for(int ele: ans){
            System.out.print(ele+ " ");
        }
        sc.close();
    }
}
