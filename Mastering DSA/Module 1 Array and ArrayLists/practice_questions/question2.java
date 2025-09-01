import java.util.Scanner;

public class question2 {//check if target value is present
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Array Size:");
        int size =sc.nextInt();
        // System.out.println("Enter the Array Elements:");
        int[] arr =new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt(); 
        }
        // System.out.println("Enter Target ELement:");
        int x=sc.nextInt();
        int addr = -1;
        for (int i = 0; i < size; i++) {
           if(arr[i]==x){
            addr = i;
            break; // Stop searching once we find the first occurrence
           }
        }
        System.out.println(addr);
        sc.close();
    }
}
