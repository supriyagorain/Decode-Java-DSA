import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {//sort arrays of 0s and 1s
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;
        for (int k = 0; k < size; k++) {
            arr[k] = sc.nextInt();
        }
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            // if(i>j) break;
            else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}
	