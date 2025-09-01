import java.util.Scanner;
public class question6 {//reverse array without using a second array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();

		int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();  
        }
        int n=arr.length;
            //reverse using two pointers
        int i=0,j=n-1;
        while (i<=j) { 
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
            }
        System.out.println();
        sc.close();
    }
    public static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}


