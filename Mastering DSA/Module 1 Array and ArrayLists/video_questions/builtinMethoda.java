
import java.util.Arrays;

public class builtinMethoda {
    public static void main(String[] args) {
        int[] arr={100,45,10,20,30,40};
        for(int ele: arr){                 //for each loop
            System.out.print(ele +" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }    
}
