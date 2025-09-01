import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {//rotate array
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();  
        }
        int k = sc.nextInt();
        rotate(arr,k);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
        public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public static void reverse(int[] nums,int i,int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }
}
