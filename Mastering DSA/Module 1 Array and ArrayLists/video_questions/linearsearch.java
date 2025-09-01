
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target ELement:");
        int x=sc.nextInt();
        System.out.println("Enter Array Size:");
        int size =sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] arr =new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt(); 
        }
        boolean flag=false;
        for (int i = 0; i < size; i++) {
           if(arr[i]==x){
            flag=true;
           
           }
        }
        if(flag==true) System.out.println("Element Found");
        else System.out.println("Element Not Found");
        sc.close();
    }
}
