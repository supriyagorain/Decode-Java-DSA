import java.util.Scanner;

public class question9 {//merge 2 sorted arrays
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] a = new int[size1];
        for (int i = 0; i < size1; i++) {
            a[i] = sc.nextInt();
        }
        int size2 = sc.nextInt();
        int[] b = new int[size2];
        for (int i = 0; i < size2; i++) {
            b[i] = sc.nextInt();
        }

        int m=a.length; int n= b.length;
        int[] c=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k]=a[i];
                i++;k++;
            }
        }
        for (int ele:c) {
            System.out.print(ele+" ");
            
        }
        sc.close();
    }
}
