import java.util.Scanner;

public class secmaxlinearsearch {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size =sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] arr =new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt(); 
        }
        int max = arr[0]; 
        for (int i = 1; i < size; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int smax = arr[0]; 
        for (int i = 1; i < size; i++) {
            if((arr[i] > smax) && (arr[i]<max)){
                smax = arr[i];
            }
        }
        System.out.println("Second Max Element : "+smax);
        sc.close();
    }
}
