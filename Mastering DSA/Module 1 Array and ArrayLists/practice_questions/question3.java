import java.util.Scanner;

public class question3 {//sum of array by creating a method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();

		int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();  
        }
        int result=sum(arr);
        System.out.println(result);
        sc.close();
    }
    public static int sum(int[] arr) {
        int n=arr.length;
        int sum=0;
        for (int i = 0; i <n; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
