
import java.util.Scanner;

public class initializeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size :");
        int n =sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(); // optional
        sc.close();

        int[] arr2={1,2,3,4,5};
        int l=arr2.length;
        for (int i = 0; i <l; i++) {
            System.out.println(arr2[i]);
        }
        
    }
}
