
import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr={100,45,10,20,30,40};
        for(int ele: arr){                 //for each loop
            System.out.print(ele +" ");
        }
        System.out.println();

        int[] nums=arr;  //shallow copy
        nums[0]=70;
        
        for(int ele: arr){                 //for each loop
            System.out.print(ele +" ");
        }
        System.out.println();
        for(int ele: nums){                //for each loop
            System.out.print(ele +" ");
        }
        System.out.println();
///////////////////////////////////////////////        
        int[] dc=Arrays.copyOf(nums, nums.length);//deep copy
        dc[0]=80;
        
        for(int ele: nums){                 //for each loop
            System.out.print(ele +" ");
        }
        System.out.println();
        for(int ele: dc){                //for each loop
            System.out.print(ele +" ");
        }
        System.out.println();
////////////////////////////////////////////
        int[] dc2=new int[nums.length]; //deep copy manual
        for (int i = 0; i < nums.length; i++) {
            dc2[i]=nums[i];
        }
        dc2[0]=90;
        
        for(int ele: nums){                 //for each loop
            System.out.print(ele +" ");
        }
        System.out.println();
        for(int ele: dc2){                //for each loop
            System.out.print(ele +" ");
        }
    }
}
