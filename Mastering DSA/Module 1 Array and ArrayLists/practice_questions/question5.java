import java.util.Scanner;

public class question5 {//print the elements of array whose sum equals the target
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
		int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();  
        }
        int target = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if ((arr[i]+arr[j])==target){
                    System.out.print(arr[i]+" "+arr[j]);
                    break;
                }
            }
            
        }

        sc.close();
    }
}
